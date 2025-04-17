

package com.pluralsight;

import java.util.Scanner;

public class FullNameParserApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String input = scanner.nextLine().trim();

        String[] parts = input.split("\\s+");

        String firstName = "";
        String middleName = "(none)";
        String lastName = "";

        if (parts.length == 2) {
            firstName = parts[0];
            lastName = parts[1];
        } else if (parts.length == 3) {
            firstName = parts[0];
            middleName = parts[1];
            lastName = parts[2];
        } else {
            System.out.println("Unexpected format. Please enter name as 'first last' or 'first middle last'.");
            return;
        }

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
    }
}
