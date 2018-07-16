package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        String numberLine = Integer.toString(number);
        int result = 0;

        for (int i = 0; i < numberLine.length(); i++){
            result += Character.getNumericValue(numberLine.charAt(i));
        }

        return result;
    }
}