package com.company;

import java.util.Scanner;

public class InputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum =0;
        boolean hasInt;
        for(int i=1; i<=10;i++){
            System.out.println("Enter no #"+i);
            hasInt = sc.hasNextInt();

            if(hasInt){
                num = sc.nextInt();
                sum = sum+num;
            }
            else {
                System.out.println("Invalid NNumber");
            }
            sc.nextLine();//handles end of line enter key

        }
        System.out.println("Sum = "+sum);
    }
}
