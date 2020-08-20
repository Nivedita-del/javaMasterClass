package com.company;

public class methodChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("Name",1500);
        int cal =  calculateHighScorePosition(1500);
        System.out.println(cal);
        displayHighScorePosition("Name1",900);
        cal =  calculateHighScorePosition(900);
        System.out.println(cal);
        displayHighScorePosition("Name2",400);
        cal =  calculateHighScorePosition(400);
        System.out.println(cal);
        displayHighScorePosition("Name1",50);
        cal =  calculateHighScorePosition(50);
        System.out.println(cal);
    }
    public static void displayHighScorePosition(String playername, int highScore){
        System.out.println(playername+" mannaged to get into position "+highScore+"On the high score table");
    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore>1000){
            return 1;
        }
        else if(playerScore>=500 ){
            return 2;
        }
        else if(playerScore>=100 ){
            return 3;
        }
        else{
            return 4;
        }
    }
}
