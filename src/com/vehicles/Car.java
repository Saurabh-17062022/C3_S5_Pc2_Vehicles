package com.vehicles;

public class Car extends VehicleManufacturer implements Vehicles{
    public Car(String vehicleName, String vehiclesModelTypes, String vehicleType) {
        super(vehicleName, vehiclesModelTypes, vehicleType);
    }

    @Override
    public int maxSpeed(String vehicleType){
        if (vehicleType.equalsIgnoreCase("sportsCar")){
            return 250;
        }else if (vehicleType.equalsIgnoreCase("Sedan")){
            return 170;

        }
        return 0;
    }
    @Override
    public String getManufacturerInformation() {
        return "Manufacturer name:"+getVehicleName()+"Model Name :"+getVehiclesModelTypes()+"vehicle type:"+getVehicleType();
    }
}