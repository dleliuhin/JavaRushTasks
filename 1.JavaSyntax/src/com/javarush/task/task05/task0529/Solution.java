package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //boolean flag = true;
        int sum = 0;
        StringBuffer buffer = new StringBuffer();
        buffer.setLength(0);

        while (true) {
            buffer.append(reader.readLine()).toString();
            if ((buffer.toString()).equals("сумма")) {
                buffer.setLength(0);
                break;
            }
            sum += Integer.parseInt(buffer.toString());
            buffer.setLength(0);
        }

        System.out.println(sum);
    }
}
