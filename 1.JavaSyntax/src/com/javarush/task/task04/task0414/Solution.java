package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = 365;
        int year = Integer.parseInt(reader.readLine());

        if (year % 100 == 0){
            if (year % 400 == 0) x = 366;
        }
        else if ((year % 4 == 0)) x = 366;

        StringBuilder builder = new StringBuilder();
        builder.append("количество дней в году: ");
        builder.append(x).toString();

        System.out.println(builder);
    }
}