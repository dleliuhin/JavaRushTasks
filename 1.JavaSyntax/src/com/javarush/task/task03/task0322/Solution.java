package com.javarush.task.task03.task0322;


/* 
Большая и чистая
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder builder = new StringBuilder();
        builder.append(reader.readLine());
        builder.append(" + ");
        builder.append(reader.readLine());
        builder.append(" + ");
        builder.append(reader.readLine());
        builder.append(" = Чистая любовь, да-да!").toString();

        System.out.println(builder);
    }
}