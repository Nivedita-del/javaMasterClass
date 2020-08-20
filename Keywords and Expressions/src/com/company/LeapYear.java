package com.company;

public class LeapYear {
    public static void main(String[] args) {
        boolean boo = isLeapYear(1924);
        System.out.println(boo);
    }
    public static boolean isLeapYear(int year){
        if(year>=1 && year<=9999){
            if((year%4) == 0){
                if((year%100) == 0){
                    if((year%400) == 0){
                        return true;
                    }return false;
                }return true;
            }return false;

        }
        return false;
    }
}
