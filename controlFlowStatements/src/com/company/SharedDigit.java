package com.company;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(51,53));
    }
    public static boolean hasSharedDigit(int num1,int num2){
        if((num1 >=10)&(num1 <=99)){
            if((num2 >=10)&(num2 <=99)){
                int num1Last =0;
                int num2last = 0;
                    num1Last = num1%10;
                    num1 = num1/10;
                    num2last = num2%10;
                    num2 = num2/10;
                    if((num1Last == num2last)||(num1Last == num2)||(num1==num2last)||num1==num2){
                        return true;

                }
            }
        }
        return false;
    }
}
