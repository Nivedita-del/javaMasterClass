package com.company;

public class  BarkingDog {
    public static void main(String[] args) {

        boolean wake = shouldWakeUp(true,-1);
        System.out.println(wake);
    }
    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
        if(hourOfDay >= 0 && hourOfDay<=23){
            if(barking){
                if(hourOfDay< 8 || hourOfDay>=22){
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
