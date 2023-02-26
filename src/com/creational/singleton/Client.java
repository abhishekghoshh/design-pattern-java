package com.creational.singleton;

import java.lang.reflect.Constructor;

public class Client {

	public static void main(String[] args) {

		System.out.println(EnumSingleton.WEEKDAY);
		System.out.println(EnumSingleton.WEEKEND);

		/*
		 * Output
		 * 
		 * Initializing enum with [Monday, Tuesday, Wednesday, Thursday, Friday]
		 * Initializing enum with [Saturday, Sunday] EnumSingleton{days=[Monday,
		 * Tuesday, Wednesday, Thursday, Friday]} EnumSingleton{days=[Saturday, Sunday]}
		 */

		EagerStaticBlockSingleton singletonInstance = EagerStaticBlockSingleton.getInstance();
		EagerStaticBlockSingleton reflectionInstance = null;

		try {
			Constructor[] constructors = EagerStaticBlockSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				reflectionInstance = (EagerStaticBlockSingleton) constructor.newInstance();
			}
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}

		System.out.println("singletonInstance hashCode: " + singletonInstance.hashCode());
		System.out.println("reflectionInstance hashCode: " + reflectionInstance.hashCode());

		/*
		 * output singletonInstance hashCode: 366712642 reflectionInstance hashCode:
		 * 1829164700
		 */

	}
}
