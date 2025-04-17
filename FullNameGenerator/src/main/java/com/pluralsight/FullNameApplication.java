package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        System.out.println("First name");
        String firstName = scanner.nextLine().trim();
        System.out.println(firstName);
        System.out.println("Middle name");
        String middleName = scanner.nextLine().trim();
        System.out.println(middleName);
        System.out.println("Last name");
        String lastName = scanner.nextLine().trim();
        System.out.println(lastName);
        System.out.println("Suffix");
        String suffix = scanner.nextLine().trim();
        System.out.println(suffix);


        StringBuilder fullName = new StringBuilder();
        fullName.append(firstName);
        if(!middleName.isEmpty()){
            fullName.append(" ").append(middleName);
        }
        fullName.append(" ").append(lastName);
        if(!suffix.isEmpty()) {
            fullName.append(" ").append(suffix);
        }

        System.out.println("Full name:" + fullName);



    }
}

