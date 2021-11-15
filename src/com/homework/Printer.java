package com.homework;

import java.util.Scanner;

/**
 * @author Volodia Sachenko
 * @version 0.1
 * @since 14.11.21
 */

public class Printer {
    private String value;

    void print(String value) {
        System.out.println((char) 27 + "[33m" + value);
    }

    private static String scanner() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        Scan scan = new Scan();
        Printing printing = new Printing();

        System.out.println("Введіть текст, який потрібно роздрукувати: \uD83D\uDDA8");
        printer.setValue(scanner());
        System.out.println("Друкуємо ваш текст: \uD83D\uDCDD");
        printer.print(printer.getValue());
        scan.print(printer.getValue());
        printing.print(printer.getValue());
    }
}
