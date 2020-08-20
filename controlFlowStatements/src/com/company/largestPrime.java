package com.company;

public class largestPrime {
    public static int getLargestPrime(int num){
        if(num<=0){
            return -1;
        }
        int largest =0;
        if(num ==1){
            return 1;
        }
        int count = 0;
        for(int j = 1;j<=num;j++){
            if(num%j==0){
            count = count+1;
        }
        }
        if(count == 2){
            return num;
        }
        for (int i = 2;i<num;i++){
            if(num%i == 0 ){
                int flag = 0;
                for(int j = 1;j<=i;j++){
                    if(i%j==0){
                        flag = flag+1;
                    }
                }
                if(flag == 2){
                    largest = i;
                }
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }
}
