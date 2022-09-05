package com.vehicles;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("Thar","Manual","sportsBike");
        System.out.println(bike.maxSpeed("sportsBike"));
        System.out.println(bike.getManufacturerInformation());
        Car car= new Car("Verna","AMT","sedan");
        System.out.println(car.maxSpeed("sedan"));
        System.out.println(car.getManufacturerInformation());



    }
}