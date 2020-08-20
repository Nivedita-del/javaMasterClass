package com.company;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
    }
    public static int sumDigits(int number){
        int sum = 0;
        int n = number;
        if(number < 10) {
            return -1;
        }
        while (number>0){
            int digit = number%10;
            sum += digit;
            number = number/10;
        }
        return sum;
    }
}
