package com.company;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(23,32,42));
    }
    public static boolean hasSameLastDigit(int num1, int num2,int num3){
        if(isValid(num1)){
            if(isValid(num2)){
                if(isValid(num3)){
                    int last1 = num1%10;
                    int last2 = num2%10;
                    int last3 = num3%10;
                    if((last1 == last2)||(last1 == last3)||(last2 == last3)){
                        return true;
                    }

                }
            }
        }
        return false;
    }
    public static boolean isValid(int num){
        if((num<10)&(num>1000)){
            return true;
        }
        return false;
    }
}
