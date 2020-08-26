package com.company;

public class ConstructorsPart_1 {
    public static void main(String[] args) {
        Account bobsAccount = new Account();//"12345", 0.00, "Bob Brown","myemail@bob.com");
        System.out.println(bobsAccount.getAccNumber());
        System.out.println(bobsAccount.getAccBalance());
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(50);
        bobsAccount.withdrawal(100);
        bobsAccount.deposit(51);
        bobsAccount.withdrawal(100);

        Account timesAccount = new Account("Tim","tim@gmail.com","12446");
    }
}
