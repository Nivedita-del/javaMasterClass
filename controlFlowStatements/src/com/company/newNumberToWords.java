package com.company;

public class newNumberToWords {
    public static void numberToWords(int num){
        if(num<0){
            System.out.println("Invalid Value");
        }
        int reversnum = reverse(num);
        int digcount = getDigitCount(num);
        while (reversnum != 0 || digcount>0){
            switch (reversnum%10){
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
            reversnum /= 10;
            digcount--;
        }
    }
    public static int reverse(int number){
        int rev = 0;
        while (number!=0){
            rev = (rev*10)+(number%10);
            number/=10;
        }
        return rev;
    }
    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }if (number ==0){
            return 1;
        }
        int count =0;
        while (number!=0){
            count++;
            number/=10;
        }
        return count;
    }

    public static void main(String[] args) {
        numberToWords(10101011);
    }
}
