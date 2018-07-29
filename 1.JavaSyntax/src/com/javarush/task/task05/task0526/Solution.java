package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("man1", 36, "pr. Mira");
        System.out.println(man1.getName() + " " + man1.getAge() + " " + man1.getAddress());
        Man man2 = new Man("man2", 29, "pr. Pobedi");
        System.out.println(man2.getName() + " " + man2.getAge() + " " + man2.getAddress());
        Woman woman1 = new Woman("woman1", 32, "pr. Mira");
        System.out.println(woman1.getName()+" "+woman1.getAge()+" "+woman1.getAddress());
        Woman woman2 = new Woman("woman2", 39, "pr. Pobedi");
        System.out.println(woman2.getName()+" "+woman2.getAge()+" "+woman2.getAddress());
    }

    public static class Man {
        private String name;
        private int age;
        private String address;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getAddress() {
            return address;
        }

        public Man(String name) {
            this.name = name;
            this.age = 9;
            this.address = null;
        }

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
            this.address = null;
        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        private String name;
        private int age;
        private String address;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getAddress() {
            return address;
        }

        public Woman(String name) {
            this.name = name;
            this.age = 9;
            this.address = null;
        }

        public Woman(String name, int age) {
            this.name = name;
            this.age = age;
            this.address = null;
        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
