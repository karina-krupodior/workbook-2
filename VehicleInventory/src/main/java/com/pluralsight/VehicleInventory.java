package com.pluralsight;

public class VehicleInventory {
    public static void main(String[] args) {
//        create an array capable of holding up to 20 vehicles and a
//        counter variable that tells you how many vehicles are in the array right now
        Vehicle [] vehicleInInventory = new Vehicle[20];
        int vehicleCount = 5;

        vehicleInInventory[0] = new Vehicle(101121,"Ford Explorer","Red",45000,13500);
        vehicleInInventory[1] = new Vehicle(101122,"Toyota Camry","Blue",50000,9700);
        vehicleInInventory[2] = new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700);
        vehicleInInventory[3] = new Vehicle(101124,"Honda Civic","White",70000,7500);
        vehicleInInventory[4] = new Vehicle(101125,"Subaru Outback","Green",55000,14500);
        vehicleInInventory[5] = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000);


    }
}
