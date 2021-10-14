package com.itland.davydovskikh.itjava;
public class TaskA {

    public static void main(String[] args) {
        System.out.println("Я Давыдовских Любовь");
        System.out.println("Начинаю изучать java");
        method();
        String s = method2("Любовь","Давыдовских","Java" );
        System.out.println(s);
    }

    private static String method2(String name,String surname,String language) {
        return "Я"+ " " + surname + " " + name +".\nНачнаю изучать" + " "+ language;
    }

     static void method() {
        String name = "Любовь";
        String surname = "Давыдовских";
        String language = "java";
        System.out.println("Я" + " " + surname + " " + name);
        System.out.println("Начинаю изучать" + " " + language);
    }

}




