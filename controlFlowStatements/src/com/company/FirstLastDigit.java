package com.company;

public class FirstLastDigit {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(2524));
    }
    public static int sumFirstAndLastDigit(int number){
        int LastDigit = number%10;
        int firstDigit = 0;
        if(number<0){
            return -1;
        }
        while(number!=0){
            firstDigit = number%10;
            number = number/10;
        }
        int sum = LastDigit+firstDigit;
        return sum;

    }
}



///