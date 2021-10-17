package com.itland.davydovskikh.itjava;

public class Args {
    String[]args;

    public Args(String[] args) {
        this.args = args;
    }
    public void printSlogan(){
        for (int i = 0; i < args.length; i++){
            System.out.println("Аргумент " + (i + 1)+": " + args[i]);
        }
    }
}
