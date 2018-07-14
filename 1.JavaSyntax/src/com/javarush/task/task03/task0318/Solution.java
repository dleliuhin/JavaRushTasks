package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //System.out.println(String.format(formatString, name, age));
        //String formatString = "%s захватит мир через %d лет. Му-ха-ха!";
        //String name = bufferedReader.readLine();
        //int age = Integer.parseInt(bufferedReader.readLine());
        //System.out.println(String.format(formatString, name, age));

        String name = bufferedReader.readLine();
        String age = bufferedReader.readLine();

        StringBuilder builder = new StringBuilder();
        builder.append(name);
        builder.append(" захватит мир через ");
        builder.append(age);
        builder.append(" лет. Му-ха-ха!");
        System.out.println(builder);
    }
}
