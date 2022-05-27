package com.example.demo.utils;

public class Dev {

    public static boolean isDevMode() {
        return System.getProperty("spring.profiles.active").contains("dev");
    }

}
