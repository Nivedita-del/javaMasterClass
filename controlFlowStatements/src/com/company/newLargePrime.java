package com.company;

public class newLargePrime {
        public static int getLargestPrime(int number){
            if(number<=1){
                return -1;
            }
            int i;
            for (i=2; i<number; i++){
                if(number%i==0){
                    number /= i;
                    i--;
                }
            }
            return i;
        }
        public static void main(String[] args) {
            System.out.println(getLargestPrime(217));
        }
    }

