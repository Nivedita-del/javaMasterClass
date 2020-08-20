package com.company;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(1010);
    }
    public static void numberToWords(int num){
        int numb = reverse(num);
        int count = getDigitCount(num);
        int count1 = getDigitCount(numb);

        int number = numb;
        if(number <0){
            System.out.println("Invalid Value");
        }
        while(number!=0){
            int last = number % 10;
            switch (last) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            number = number/10;
        }
        if (count1 != count){
            for(int i = 0;i<count;i++){
                if(count == count1){
                    break;
                }
                System.out.println("Zero");
                count1++;
            }
        }
    }
    public static int reverse(int number){
        int sum = 0 ;
        while (number!=0){
            int res = number%10;
            sum = (sum*10) +res;
            number = number/10;
        }
        return sum;
    }
    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        if(number == 0){
            return 1;
        }
        int count =0;
        int last = number%10;
        if(last == 0){
            while (number!=0){
                number = number/10;
                count++;
            }
            return count;
        }
        while (number!=0){
            count++;
            number = number/10;
        }

        return count;
    }
}
