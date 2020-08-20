package com.company;

public class SecondsAndMin {
    private static final String INVALD_VALUE_MESSAGE = "Invalid Value" ;
    public static void main(String[] args) {
        String time = getDurationString(65,2);
        String sectomin = getDurationString(123456789);
        System.out.println(time);
        System.out.println(sectomin);
    }
    public static String getDurationString(int min, int sec){
        if((min<0)||(sec<0)||(sec>59)){
            return INVALD_VALUE_MESSAGE;
        }
        int hrs = (min/60);
        int remainingmin =(int) (min%60);
        String hrsstr = hrs+" h ";
        String minstr = remainingmin+" m ";
        String secstr = sec+" s ";
        if(hrs<10 || min<10 || sec<10){
            hrsstr = "0"+hrsstr;
            minstr = "0"+minstr;
            secstr = "0"+secstr;
        }
        return (hrsstr+minstr+secstr);

    }
    public static String getDurationString(int sec){
        if(sec<=0){
            return INVALD_VALUE_MESSAGE;
        }
        int min = (int)(sec/60);
        int remainingsec =(int) (sec%60);
        return getDurationString(min,remainingsec);
    }

}
