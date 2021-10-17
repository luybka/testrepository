package com.itland.davydovskikh.itjava;
import java.util.Scanner;

public class TaskC {

    public static void main(String[] args) {
        //задание 3.1
        int a = 0;
        int b = 5;
        int c = a+b;
        int d = (a+b)/c;
        System.out.println(c);
        System.out.println(" ");
        System.out.println(" ");

        //задание 3.2
        Scanner scanner = new Scanner(System.in);
        double result = Math.pow(5,15) - Math.pow(7,10) * Math.cos(90) + Math.sin(25) * Math.pow(-5,15);
        System.out.println(result);
        System.out.println(" ");
        System.out.println(" ");

        //задание 3.3
        System.out.println(d);
    }
}
