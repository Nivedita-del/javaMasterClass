package com.company;

public class Account {
    private String accNumber;
    private double accBalance;
    private String customerName;
    private String phoneNumber;
    private String custemail;

    public Account(){
        this("56789",2.50,"Default name","Default phone"); // this line must be the very first line
        System.out.println("Empty constructor called ");
    }

    public Account(String accNumber,double accBalance, String customerName, String phoneNumber){
        System.out.println("Account with parameters were called");
        this.accNumber = accNumber;
        this.accBalance = accBalance;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String custemail, String phoneNumber) {
        this("99999",10002,customerName,phoneNumber);
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length()<10){
            System.out.println("invalid number");
        }
        else {
            this.phoneNumber = phoneNumber;
        }
    }

    public void deposit(double depositAmount){
        this.accBalance += depositAmount;
        System.out.println("Deposit of "+ depositAmount+" made now ur balance is "+accBalance);
    }

    public void withdrawal(double withdrawAmount){
        if(this.accBalance - withdrawAmount <0){
            System.out.println("Only"+ this.accBalance +" available. withdrawal not processed");
        }
        else{
            this.accBalance -=withdrawAmount;
            System.out.println("Withdrawal of "+ withdrawAmount+"processed. Remaining balance = "+accBalance);
        }
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustemail() {
        return custemail;
    }

    public void setCustemail(String custemail) {
        this.custemail = custemail;
    }

}
