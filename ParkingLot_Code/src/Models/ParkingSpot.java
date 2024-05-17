package Models;

public class ParkingSpot {
    private VehicleType vehicleType;
    private ParkingSpotStatus parkingSpotStatus;
    private  int number;
    private Floor floor;

    public ParkingSpot(VehicleType vehicleType, ParkingSpotStatus parkingSpotStatus, int number, Floor floor) {
        this.vehicleType = vehicleType;
        this.parkingSpotStatus = parkingSpotStatus;
        this.number = number;
        this.floor = floor;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public int getVehicleNumber() {
        return number;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.number = vehicleNumber;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }
}
