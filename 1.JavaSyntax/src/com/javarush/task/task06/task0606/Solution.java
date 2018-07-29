package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String num = reader.readLine();
        int val = 0;

        for (int i = 0; i < num.length(); i++) {
            val = Character.getNumericValue(num.charAt(i));
            if (val % 2 == 0) even++;
            else odd++;
        }

        StringBuffer buffer = new StringBuffer();
        buffer.append("Even: ");
        buffer.append(even);
        buffer.append(" Odd: ");
        buffer.append(odd).toString();

        System.out.println(buffer);
    }
}
