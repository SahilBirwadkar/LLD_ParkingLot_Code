package Models;

public class Vehicle {
    private String vehicleNumber;
    private VehicleType vehicleType;
    private String owner;

    public Vehicle(String vehicleNumber, VehicleType vehicleType, String owner) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.owner = owner;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
