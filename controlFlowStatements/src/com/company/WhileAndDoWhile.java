package com.company;

public class WhileAndDoWhile {
    public static void main(String[] args) {
        int count=1;
        while(count!=6){
            System.out.println("count value is "+count);
            count++;
        }
        count =1;
        while (true){
            if(count == 6){
                break;
            }
            System.out.println("count val "+ count );
            count++;
        }
        count = 1;
        do{
            System.out.println("count val was "+count);
            count++;
            if(count>100){
                break;
            }
        }while (count!=6);


        //challenge
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while(number<=finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            evenNumbersFound++;
            if(evenNumbersFound>=5){
                break;
            }
            System.out.println("Even number "+number);
        }
        System.out.println("total even numbers found"+evenNumbersFound);
    }
    public static boolean isEvenNumber(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
}
