package com.company;

public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(100,1000));
    }
    public static boolean isOdd(int num){
        if(num<0){
            return false;
        }
        else if (num%2!=0){
            return true;
        }
        else {
        return false;
    }
    }
    public static int sumOdd(int start,int end){
        int sum = 0;
            if(end>=start){
                if((start>0)&(end>0)){
                    for(int i= start; i<=end;i++){
                        if(isOdd(i)){
                            sum = sum+i;

                        }
                    }return sum;
                }
            }
        return -1;

    }
}

