package com.company;

public class Main {

    public static void main(String[] args) {
	    calculateScore(800, 5, 100);
	    calculateScore(10000, 8, 200);

    }

    public static int calculateScore(int score, int levelCompleted, int bonus) {
        int finalScore = score + (levelCompleted * bonus);
        finalScore += 1000;
        System.out.println("Your final score was " + finalScore);
        return finalScore;
    }

}
