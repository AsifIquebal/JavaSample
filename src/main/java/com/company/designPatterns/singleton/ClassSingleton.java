package com.company.designPatterns.singleton;

public final class ClassSingleton {
    private static ClassSingleton INSTANCE;
    private String info = "Initial info class";
    private ClassSingleton() {
    }
    public synchronized static ClassSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ClassSingleton();
        }
        return INSTANCE;
    }
    // getters and setters
}
