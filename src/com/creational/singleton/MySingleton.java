package com.creational.singleton;

class MySingleton {
    private static final MySingleton instance = new MySingleton();

    private MySingleton() {}

    public static MySingleton getInstance() {
        return instance;
    }
}