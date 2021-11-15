package com.homework;

public class Printing extends Printer {
    @Override
    void print(String value) {
        System.out.println((char) 27 + "[31m" + value);
    }
}
