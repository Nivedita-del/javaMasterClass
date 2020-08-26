package com.company;

public class ConstructorPart2 {
    public static void main(String[] args) {
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer();
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer();
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());
    }
}
