package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        CellPhone phone = new CellPhone();
        CellPhone phone1 = new CellPhone();
        CellPhone phone3 = new CellPhone();
        phone3.setSerialNumber(12356);
        phone3.setCarrier("T-mobile");
        phone3.setModel("phone");
        phone3.setOwner("Karina");
        phone3.setPhoneNumber("12345678");

        CellPhone cellPhone3 = new CellPhone(333, "Pixel 6", "Verizon", "555-333-2222", "Alex King");
//display(phone);
//display(phone1);
display(phone3);
display(cellPhone3);
        System.out.print("What is the serial number");
        phone.setSerialNumber(Integer.parseInt(scanner.nextLine()));
        System.out.print("What model ?");
        phone.setModel(scanner.nextLine());
        System.out.print("Who is the carrier?");
        phone.setCarrier(scanner.nextLine());
        System.out.print("What is the phone number?");
        phone.setPhoneNumber(scanner.nextLine());
        System.out.print("Who is the owner of the phone?");
        phone.setOwner(scanner.nextLine());

        System.out.println("SerialNumber" + phone.getSerialNumber());
        System.out.println("Model" + phone.getModel());
        System.out.println("carrier" + phone.getCarrier());
        System.out.println("Phone number" + phone.getPhoneNumber());
        System.out.println("owner" + phone.getOwner());
        scanner.close();

    }

    public static void display(CellPhone phone) {
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
        System.out.println();
    }



}
