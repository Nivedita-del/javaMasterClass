package com.company;

public class methods {
        //method overloading.
        //need to create a unique signature for method overloadin
        //same method name with different args, same methodname with different return statment
        public static int calculateScore(String playerName, int score) {
            System.out.println("player " + playerName + " scored " + score + " points");
            return score * 1000;
        }

        public static int calculateScore(int score) {
            System.out.println("unamed player" + " scored " + score + " points");
            return score * 1000;
        }

        public static int calculateScore() {
            System.out.println("no player, no score");
            return 0;
        }


        public static void main(String[] args) {
            int newScore = calculateScore("nive", 500);
            int score_only = calculateScore(100);
            calculateScore();
            System.out.println("NewScore " + newScore);
            System.out.println("over loading method " + score_only);
        }
    }


