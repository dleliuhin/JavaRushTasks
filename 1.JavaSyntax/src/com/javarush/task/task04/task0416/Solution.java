package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Double t = Double.parseDouble(reader.readLine());

        t = t % 5;

        if ((0 <= t) && (t < 3)) System.out.println("зелёный");
        else if ((3 <= t) && (t < 4)) System.out.println("жёлтый");
        else if ((4 <= t) && (t < 5)) System.out.println("красный");
    }
}