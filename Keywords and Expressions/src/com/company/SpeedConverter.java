package com.company;

import java.util.Scanner;

public class SpeedConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kilometer = sc.nextDouble();
        double convert = toMilesPerHour(kilometer);
        System.out.println(convert);
        printConversion(kilometer);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour <0 ){
            return -1;
        }
        long mile =  (Math.round(kilometersPerHour*0.6213712));
        return mile;

    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0){
            System.out.println("Invalid");
        }
        System.out.println(kilometersPerHour+" km/h "+toMilesPerHour(kilometersPerHour)+" mi/h ");
    }
}
