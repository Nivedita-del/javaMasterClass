package com.company;

public class Person {
    private String firstName;
    private String lastname;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        int validage = this.age;
        if((validage <0)||(validage > 100)){
            this.age = 0;
        }
        else {
            this.age = age;
        }
    }
    public boolean isTeen(){
        if((age> 12)&&(age<20)){
            return true;
        }
        return false;
    }
    public String getFullName(){
        if((firstName.isEmpty())&&(lastname.isEmpty())){
            return "";
        }
        else if(firstName.isEmpty()){
            return lastname;
        }
        return firstName;
    }

}
