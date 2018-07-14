package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String formatString = "%s захватит мир через %d лет. Му-ха-ха!";
        String name = bufferedReader.readLine();
        int age = Integer.parseInt(bufferedReader.readLine());
        System.out.println(String.format(formatString, name, age));
    }
}
