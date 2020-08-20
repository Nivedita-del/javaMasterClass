package com.company;

public class DecimalComparator {
    public static void main(String[] args) {
        boolean boo = areEquealByThreeDecimalPlaces(-3.123,3.123);
        System.out.println(boo);
    }
    public static boolean areEquealByThreeDecimalPlaces(double a,double b){
        int dec1 = (int)(a*1000);
        int dec2 = (int)(b*1000);
        if(dec1 == dec2){
            return true;
        }
        else {
            return false;
        }
    }
}
