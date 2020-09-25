package com.creational.singleton.singleton;

public class LazySingleton {

    private static LazySingleton instance;

    /** Don't let anyone else instantiate this class */
    private LazySingleton() {}

    public static synchronized LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}