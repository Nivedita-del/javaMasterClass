package com.company;

public class FlourPacker {

        public static boolean canPack(int bigCount, int smallCount, int goal){
            int total = (bigCount*5)+smallCount;
            int sum = 0;
            int num = 0;
            if(total>=goal){
                for(int i = 1; i<=bigCount;i++){
                    num = i*5;
                    if(num == goal){
                        return true;
                    }
                    for (int j=1;j<=smallCount;j++){
                        sum = j+num;
                        if(sum == goal){
                            return true;
                        }

                    }

                }
                for (int j=1;j<=smallCount;j++){
                    sum = j+num;
                    if(sum == goal){
                        return true;
                    }

                }

            }
            return false;
        }

    public static void main(String[] args) {
        System.out.println(canPack(0,5,4));
    }
}
