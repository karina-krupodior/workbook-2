package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get user's full name
        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine().trim(); // Geri Johnson
        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        // Step 2: Get the date
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String dateInput = scanner.nextLine().trim(); // 5/13/2023
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(dateInput, inputFormatter); // Parse into ISO format

        // Step 3: Get number of tickets
        System.out.print("How many tickets would you like? ");
        int ticketCount = Integer.parseInt(scanner.nextLine().trim());

        // Step 4: Format ticket(s) and output
        String ticketWord = ticketCount == 1 ? "ticket" : "tickets";
        System.out.println(ticketCount + " " + ticketWord + " reserved for " + date +
                " under " + lastName + ", " + firstName);
    }
}
