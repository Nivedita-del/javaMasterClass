package com.company;

public class Sum3And5Challenge {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for(int i =0; i<=1000;i++){
            if (count<=5) {
                if ((i % 3 == 0) & (i % 5 == 0)) {
                    System.out.println(i);
                    sum =sum + i;
                    count++;
                }
            }
            else{
                break;
            }
        }
        System.out.println("Total sum = "+sum);
    }
}
