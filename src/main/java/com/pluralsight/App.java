package com.pluralsight;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Asset> mainHouse = new ArrayList<>();
        ArrayList<Asset> mainVehicle = new ArrayList<>();
        ArrayList<Asset> vacationHouse = new ArrayList<>();
        ArrayList<Asset> weekendCar = new ArrayList<>();

        Asset mainHouse1 = new Asset("Beach House", "10/21/2025", 5000000);
        System.out.println(mainHouse1.getDescription());
        System.out.println(mainHouse1.getDateAcquired());
        System.out.println(mainHouse1.getOriginalCost());

        House mainhouse1 = new House("123 Malibu Rd", 1, 5500, 500);
        System.out.println(mainhouse1.getValue());

        Asset mainVehicle1 = new Asset("Cyber Truck", "12/25/2025", 100000);
        System.out.println(mainVehicle1.getDescription());
        System.out.println(mainVehicle1.getDateAcquired());
        System.out.println(mainVehicle1.getOriginalCost());

        Vehicle mainvehicle1 = new Vehicle("Tesla: Cyber Truck", 2025, 2000);
        System.out.println(mainvehicle1.getValue());

        Asset vacationHouse1 = new Asset("Snow House", "1/2/2025", 2000000);
        System.out.println(vacationHouse1.getDescription());
        System.out.println(vacationHouse1.getDateAcquired());
        System.out.println(vacationHouse1.getOriginalCost());

        Asset vacationhouse1 = new House("321 Aspen Hill", 2, 10000, 320);
        System.out.println(vacationhouse1.getValue());
        if (vacationhouse1 instanceof House){
            System.out.println(((House) vacationhouse1).getAddress());
        }

        Asset weekendVehicle1 = new Asset("Rolls Royce Cullian", "2/5/2025", 250000);
        System.out.println(weekendVehicle1.getDescription());
        System.out.println(weekendVehicle1.getDateAcquired());
        System.out.println(weekendVehicle1.getOriginalCost());

        Asset weekendvehcile1 = new Vehicle("Rolls Royce: Cullian", 2025, 200);
        System.out.println(weekendvehcile1.getValue());
        if (weekendvehcile1 instanceof Vehicle){
            System.out.println(((Vehicle) weekendvehcile1).getMakeModel());
        }
        /*ArrayList<Asset> myAssets = new ArrayList<>();
        myAssets.add(new House("123 Malibu Rd", 1, 5000, 500));
        myAssets.add(new Vehicle("Rolls-Royce: Cullinan", 2025, 200));
        String message = "";
        for (int i = 0; i < myAssets.size(); i++) {
            if (myAssets.get(i) instanceof House) {
                House house = (House) myAssets.get(i);
                System.out.println(message = "House at: " + house.getAddress());
            } else if (myAssets.get(i) instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) myAssets.get(i);
                System.out.println(message = "Vehicle: " +
                        vehicle.getYear() + " " + vehicle.getMakeModel());
            }
        */ }
    }
