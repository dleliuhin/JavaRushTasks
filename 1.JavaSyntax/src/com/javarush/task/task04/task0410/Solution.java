package com.javarush.task.task04.task0410;

/* 
Попадём-не-попадём
*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Число ");

        if ((50 <= a) && (a <= 100)) stringBuilder.append(a);
        else stringBuilder.append(a + " не");

        stringBuilder.append(" содержится в интервале.").toString();

        System.out.println(stringBuilder);
    }
}