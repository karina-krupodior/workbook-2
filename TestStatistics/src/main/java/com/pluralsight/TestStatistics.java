package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args) {
//        Create an array of 10 test scores
                int[] scores  = {90,60,85,85,90,100,70,75,80,65};

//      average

        int sum = 0;
        double average;
        for (int i = 0; i < scores.length; i++){
            sum = sum + scores[i];
        }
        average = sum / scores.length;


        //    high score
        int highScore =  scores[0];
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] > highScore) {
                highScore = scores[i];
            }
        }

//  low score with for each
int lowScore = scores[0];
        for(int score : scores) {
            if(score > lowScore) {
                lowScore = score;
            }

        }

        System.out.println("Average: " + average);
        System.out.println("High Score: " + highScore);
        System.out.println("Low Score: " + lowScore);
    }

}
