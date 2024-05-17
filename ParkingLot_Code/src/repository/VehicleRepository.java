package repository;

import Models.Vehicle;
import Models.VehicleType;

import java.util.HashMap;

public class VehicleRepository {
    HashMap<String, Vehicle> vehicleHashMap = new HashMap<>();

    public Vehicle createVehicle(String vehicleNumber, VehicleType type, String owner){
        Vehicle vehicle = new Vehicle(vehicleNumber,type,owner);
        vehicleHashMap.put(vehicleNumber, vehicle);
        return vehicle;
    }
    public Vehicle getVehicleNumber(String vehicleNumber) {
        return vehicleHashMap.get(vehicleNumber);
    }
}
