package com.homework;

public class Scan extends Printer {
    @Override
    void print(String value) {
        System.out.println((char) 27 + "[32m" + value);
    }
}
