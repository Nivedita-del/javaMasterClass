package com.company;

public class Main {
    public static void main(String[] args) {
        //public key word is an access modifier, it will allow user to use
//its like permissions others like private and protected. the word public
//it means unrestried access to the class
//private-no othere classes can access this class
//protected-which allows classes in this package to access your class
//based on our requirements we can remove access modifiers
//class is an blueprint.
//variables
//local vairable inside the method, we can create outside the method.
//classes alllows to create vairables and we can access within the class that we are creating.
//class or member virables, but generally called field.
//so generally for fileds we need to use access modifiers,
//so basically we use private because we can use ousider othe class
//we are using private becasue to adheing to encapsulation
//encapsulation is to nothing but wrapping the program with some protected fields
//encapsulation in java is used to hide the fields and methods.
//the internal representaion of an object is gonna be hidden from view outside the object's definition
//the internal workings of an particualr object is going be hidden and not shown outside of the class
            Car porsche = new Car();
            Car holden = new Car();
            System.out.println("Model is "+porsche.getModel());
            porsche.setModel("Carrera");
            System.out.println("Model is "+porsche.getModel());
    }
}
