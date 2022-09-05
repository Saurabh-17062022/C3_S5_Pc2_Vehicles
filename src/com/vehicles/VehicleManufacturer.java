package com.vehicles;

public  abstract class  VehicleManufacturer {
    private String vehicleName;
    private String vehiclesModelTypes;
    private String  vehicleType;

    public String getVehicleName() {
        return vehicleName;
    }

    public VehicleManufacturer(String vehicleName, String vehiclesModelTypes, String vehicleType) {
        this.vehicleName = vehicleName;
        this.vehiclesModelTypes = vehiclesModelTypes;
        this.vehicleType = vehicleType;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehiclesModelTypes() {
        return vehiclesModelTypes;
    }

    public void setVehiclesModelTypes(String vehiclesModelTypes) {
        this.vehiclesModelTypes = vehiclesModelTypes;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    public abstract String getManufacturerInformation();

    abstract int maxSpeed(String vehicleType);
}