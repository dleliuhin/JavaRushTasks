package com.javarush.task.task03.task0320;


/* 
Скромность украшает программиста
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        StringBuilder builder = new StringBuilder();
        builder.append(name).append(" зарабатывает $5,000. Ха-ха-ха!").toString();
        System.out.println(builder);
    }
}
