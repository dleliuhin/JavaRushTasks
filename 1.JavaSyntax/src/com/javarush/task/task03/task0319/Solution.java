package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());

        StringBuilder builder = new StringBuilder();
        builder.append(name).append(" получает ").append(number1).append(" через ");
        builder.append(number2).append(" лет.").toString();

        System.out.println(builder);
    }
}
