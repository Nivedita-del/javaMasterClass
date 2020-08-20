package com.company;

public class EqualSumChecker {
    public static void main(String[] args) {
        boolean boo = hasEqualSum(1,-1,0);
        System.out.println(boo);
    }
    public static boolean hasEqualSum(int a,int b,int c){
        int sum = a+b;
        if(sum == c){
            return true;
        }
        else {
            return false;
        }
    }
}
