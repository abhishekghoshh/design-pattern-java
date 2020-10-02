package com.structural.proxy;

import com.structural.proxy.internet.Internet;
import com.structural.proxy.proxy.ProxyInternet;

public class Client {
	public static void checkInternet(Internet internet) {
		try{
			internet.grantInternetAccess();
			internet.connectTo("jasonfedin.org");
			internet.connectTo("whatever.com");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String args[]) {
		Internet internet = new ProxyInternet("Ashwani Rajput");
		checkInternet(internet);
		internet = new ProxyInternet("Abhishek Ghosh");
		checkInternet(internet);
	}
}
