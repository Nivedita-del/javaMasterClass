package com.company;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int number){
        int lastDigit = 0;
        int reverse = number;
        int sum = 0;
        while(number!=0){
            lastDigit = number%10;
            sum = (sum*10)+lastDigit;
            number = number/10;
        }
        if (sum==reverse){
            return true;
        }
        else {
            return false;
        }
    }
}
//