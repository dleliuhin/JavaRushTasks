package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        int max = Math.max(Math.max(num1,num2),num3);
        int min = Math.min(Math.min(num1,num2),num3);

        int sum = num1 + num2 + num3;
        int mid = sum - max - min;

        System.out.println(max + " " + mid + " " + min);
    }
}
