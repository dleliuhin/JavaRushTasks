package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        int sum = num1 + num2 + num3;

        System.out.println(sum - Math.max(num1, Math.max(num2, num3)) - Math.min(num1, Math.min(num2, num3)));
    }
}
