package com.company;

import java.util.Scanner;

public class positiveNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        check(num);

    }
    public static void check(int num){
        if(num>0){
            System.out.println("Positive");
        }
        else if(num<0){
            System.out.println("Neg");
        }
        else{
            System.out.println("Zero");
        }
    }
}
