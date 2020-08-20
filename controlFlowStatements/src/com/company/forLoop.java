package com.company;

public class forLoop {
    public static void main(String[] args) {
        System.out.println(calculateInterest(10000,2));
        for(int i =0;i<5;i++){
            System.out.println("loop"+i+"hello!");
        }
        for(int i = 8;i>=2;i--){
            System.out.println(String.format("%.2f",calculateInterest(10000,i)));
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount *(interestRate/100));
    }
}

