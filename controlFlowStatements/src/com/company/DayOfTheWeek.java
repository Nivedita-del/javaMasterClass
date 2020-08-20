package com.company;

public class DayOfTheWeek {
    public static void main(String[] args) {
        printDayOfTheWeek(2);
    }
    public static void printDayOfTheWeek(int day){
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tue");
                break;
            case 4:
                System.out.println("Wed");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Fri");
                break;
            case 7:
                System.out.println("Sat");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
