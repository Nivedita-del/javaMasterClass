package com.company;

public class ifElse {
    public static void main(String[] args) {
        boolean gameOver = true;
        int Score = 5000;
        int Score2 = 10000;
        int levelCompleted = 5;
        int levelCompleted2 = 8;
        int bonus2 = 200;
        int bonus = 100;

 //       if(Score<5000 && Score>1000){
 //           System.out.println("Your Score was less than 5000 but greater than 1000");

//        }
 //       else if(Score<1000){
 //           System.out.println("Your score was less than 1000");
  //      }
    //    else {
      //      System.out.println("Got here");
        //}
        int finalScore = 0;
        if(gameOver == true){
            finalScore = Score +(levelCompleted*bonus);
            int finalScore2 = Score2 +(levelCompleted2 * bonus2);
            System.out.println("Your final Score is "+ finalScore );
            System.out.println("Your second final score is "+ finalScore2);
        }
        int savedFinalScore = finalScore;
        System.out.println(savedFinalScore);
    }
}
