package com.company;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int num){
        if(num<0){
            return -1;
        }
        int last = 0;
        int sum = 0;
        while (num!=0){
            last = num%10;
            if(last%2 == 0){
                sum = sum + last;
            }
            num = num/10;
        }
        return sum;
    }
}
