package strategy;

import Models.ParkingLot;
import Models.ParkingSpot;
import Models.Vehicle;
import Models.VehicleType;

import Exception.*;
public interface ParkingSpotAllotmentStrategy {
    public ParkingSpot getParkingSpot(VehicleType type, ParkingLot parkingLot) throws ParkingSpotUnavailableException;
}
