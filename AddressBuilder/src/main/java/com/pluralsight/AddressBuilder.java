package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        System.out.print("Full name: ");
        String fullName = scanner.nextLine();
        result.append(fullName + "\n");

        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();

        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();

        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();

        System.out.print("Billing Zip: ");
        String billingZip = scanner.nextLine();

        result.append("Billing Address:\n");
        result.append(billingStreet + "\n");
        result.append(billingCity + ", " + billingState + " " + billingZip + "\n");

        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine();

        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();

        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();

        System.out.print("Shipping Zip: ");
        String shippingZip = scanner.nextLine();

        result.append("Shipping Address:\n");
        result.append(shippingStreet + "\n");
        result.append(shippingCity + ", " + shippingState + " " + shippingZip + "\n");

        System.out.println();
        System.out.println(result);
    }
}
