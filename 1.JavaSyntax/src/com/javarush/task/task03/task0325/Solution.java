package com.javarush.task.task03.task0325;

import java.io.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String formatString = "Я буду зарабатывать $%d в час";

        int salary = Integer.parseInt(bufferedReader.readLine());

        System.out.println(String.format(formatString, salary));
    }
}
