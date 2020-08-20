package com.company;

import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int min = 0; // int min = Integer.MIN_VALUE;
        int max =0; // int max = Integer.MAX_VALUE;
        boolean first = true;
        while(true){
            System.out.println("Enter number");
            boolean hasInt = sc.hasNextInt();
            if(hasInt) {
                num = sc.nextInt();
                if(first){
                    first = false;
                    min = num;
                    max = num;
                }
                if (num > max) {
                    max = num;
                }
                if(num<min){
                    min = num;
                }
            }
            else {
                break;
            }
            sc.nextLine();
        }
        System.out.println("min = "+min +"max = "+max);
    }
}
