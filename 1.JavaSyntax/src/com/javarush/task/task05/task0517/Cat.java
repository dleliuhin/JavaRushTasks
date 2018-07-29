package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    private String name;
    private int weight;
    private int age;
    private String color;
    private String address;

    public Cat(String name) {
        this.name = name;
        this.weight = 7;
        this.age = 9;
        this.color = "color";
        this.address = null;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "color";
        this.address = null;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.weight = 7;
        this.age = age;
        this.color = "color";
        this.address = null;
    }

    public Cat(int weight, String color) {
        this.name = null;
        this.weight = weight;
        this.age = 9;
        this.color = color;
        this.address = null;
    }

    public Cat(int weight, String color, String address) {
        this.name = null;
        this.weight = weight;
        this.age = 9;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
