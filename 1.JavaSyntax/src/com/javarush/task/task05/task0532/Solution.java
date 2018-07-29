package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        int n = 0;
        int num = Integer.parseInt(reader.readLine());

        n = num >= 0 ? num : Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++){
            num = Integer.parseInt(reader.readLine());
            if (i == 0) maximum = num;
            maximum = Math.max(maximum,num);
        }

        System.out.println(maximum);
    }
}
