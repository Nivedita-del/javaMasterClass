package com.company;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearAndDays(561600);
    }
    public static void printYearAndDays(long minutes) {
        if (minutes <= 0) {
            System.out.println("Invalid");
        }
        int hrs = (int) (minutes / 60);
        int days = hrs / 24;
        int years = days / 365;
        int remain = days%365;
        System.out.println(minutes + " min = " + years + " y and " + remain +" d");
    }

}