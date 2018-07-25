package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("Меня зовут ");
        stringBuffer.append(reader.readLine());
        stringBuffer.append(".");
        stringBuffer.append("\nЯ родился ");

        int y = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        stringBuffer.append(d);
        stringBuffer.append(".");
        stringBuffer.append(m);
        stringBuffer.append(".");
        stringBuffer.append(y);

        System.out.println(stringBuffer);
    }
}
