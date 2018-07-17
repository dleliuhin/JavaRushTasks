package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int choiceVar = Integer.parseInt(reader.readLine());

        if (choiceVar > 0) choiceVar *= 2;
        else if (choiceVar < 0) choiceVar ++;

        System.out.println(choiceVar);
    }

}