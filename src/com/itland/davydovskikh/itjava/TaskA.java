package com.itland.davydovskikh.itjava;

public class TaskA {
    public static void main(String[] args) {
        System.out.println("Я Давыдовских Любовь");
        System.out.println("Начинаю изучать java");
        method();
    }
    static void method(){
        String surname = "Давыдовских";
        String name = "Любовь";
        String language = "java";
        System.out.println("Я"+ " "+surname+" "+name);
        System.out.println("Начинаю изучать"+ " "+ language);
    }

}
