package com.company;

public class newFlourPacker {
    public static boolean canPack (int bigCount, int smallCount, int goal){
        bigCount = (bigCount*5);
        int sumLoad=0;
        if (goal<0 && bigCount<0 && smallCount<0){
            return false;
        }
        sumLoad = bigCount+smallCount;
        if(sumLoad>=goal){
            if (bigCount >= 1 && smallCount == 0 && (goal % 5) == 0) {
                return true;
            }
            if (smallCount >= 1 && bigCount >= 0 && smallCount >= goal) {
                return true;
            }
            if (bigCount >= 1 && smallCount >= 1 && (goal % 5) <= smallCount) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canPack(2,2,11));
    }
}
