package com.company;

public class calculate {

    public static void main(String[] args) {
	double dou = calcFeetAndInchesToCentimeters(7,1 );
	double out = calcFeetAndInchesToCentimeters(100);
        System.out.println(dou);
        System.out.println(out);

    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if((feet <0)|| ((inches <0) || ( inches >12))){
            return -1;
        }
        double centi = (feet*12)*2.54;
        centi += inches*2.54;
        System.out.println(feet+" feet "+inches+" inches = "+centi +" cm");
        return centi;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches>=0){
            double feet = (int) inches/12;
            double remainingInches = (int)inches%12;
            System.out.println(inches+" inches is equeal to "+feet+" feet and "+ remainingInches+" inches");
            return calcFeetAndInchesToCentimeters(feet,remainingInches  );
        }
        return -1;
    }
}
