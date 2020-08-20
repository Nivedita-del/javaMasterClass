package com.company;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count =0;
        int avg =0;
        while(true){
            boolean flag = sc.hasNextInt();
            if(flag){
                int num = sc.nextInt();
                sum = sum + num;
                count = count+1;
                avg = Math.round(sum/count);
            }
            else {
                break;
            }
            sc.nextLine();
        }
        System.out.println("SUM = "+sum+" AVG = "+avg);
    }
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
