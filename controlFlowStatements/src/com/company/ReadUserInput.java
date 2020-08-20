package com.company;

import java.util.Scanner;

public class ReadUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your year of birth");
        boolean hasNextInt = sc.hasNextInt();
        if(hasNextInt) {

            int year = sc.nextInt();
            int age = 2020 - year;

            System.out.println("your name");
            String name = sc.nextLine();
            if (age >= 0 && age <= 100) {

                System.out.println("Your name is " +    name + " and you are " + age + " years old");
            } else {
                System.out.println("Invalid year of birth");
            }
        }
        else{
            System.out.println("Unable to parse year of birth");
        }
    }
}
