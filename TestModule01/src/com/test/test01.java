package com.test;

public class test01 {
    public static void main(String[] args){
        System.out.println("Hello Idea");
        eat("Tester");
    }
    private String name;
    private int age;


    public static void eat(String name){
        System.out.println(name + " eat");
    }

    public static void drink(){
        System.out.println("bear");
    }
}
