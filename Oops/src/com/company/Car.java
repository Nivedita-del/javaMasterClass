package com.company;

public class Car {
    private int doors;
    private int wheels;
    public String model;
    private String engine;
    private String colour;

    // this is used for encaptulation so that the others dont understand the code
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("porche") || validModel.equals(("holden")))
        {        this.model = model;
        }
        else{
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;

    }
}
