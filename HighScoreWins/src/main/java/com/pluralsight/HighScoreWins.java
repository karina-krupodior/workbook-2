package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get user input
        System.out.print("Please enter a game score: ");
        String input = scanner.nextLine().trim(); // e.g., "Home:Visitor|21:9"

        // Step 2: Split input by "|"
        String[] parts = input.split("\\|"); // parts[0] = "Home:Visitor", parts[1] = "21:9"

        // Step 3: Split team names and scores
        String[] teams = parts[0].split(":"); // teams[0] = "Home", teams[1] = "Visitor"
        String[] scores = parts[1].split(":"); // scores[0] = "21", scores[1] = "9"

        // Step 4: Convert scores to integers
        int homeScore = Integer.parseInt(scores[0].trim());
        int visitorScore = Integer.parseInt(scores[1].trim());

        // Step 5: Determine winner
        String winner;
        if (homeScore > visitorScore) {
            winner = teams[0].trim(); // "Home"
        } else {
            winner = teams[1].trim(); // "Visitor"
        }

        // Step 6: Print result
        System.out.println("Winner: " + winner);
    }
}
