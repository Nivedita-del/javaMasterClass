package com.company;

public class method {
    public static void main(String[] args) {
        int highScore = calculateScore(true, 800,5, 100);
        System.out.println("your final score was"+ highScore);
        highScore = calculateScore(true, 10000,8,200);
        System.out.println("your final high score was"+highScore);
    }

    public static int calculateScore(boolean gameOver, int Score, int levelCompleted, int bonus) {
        if(gameOver){
            int finalScore = Score +(levelCompleted*bonus);

            return finalScore;
        }
        return -1;
    }
}
