package com.itland.davydovskikh.itjava;

public class Main {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.printSlogan();
        hello.setSlogan("Привет,Мир!");
        hello.printSlogan();
        Args argObj = new Args(args);
        argObj.printSlogan();
    }
}
