package Models;

import strategy.ParkingSpotAllotmentStrategy;

import java.util.List;
import Exception.*;

public class ParkingLot {
    private List<Floor> floorList;
    private  List<Gate> gateList;
    private ParkingLotStatus parkingLotStatus;
    private ParkingSpotAllotmentStrategy parkingSpotAllotmentStrategy;

    public ParkingLot(List<Floor> floorList, List<Gate> gateList, ParkingLotStatus parkingLotStatus, ParkingSpotAllotmentStrategy parkingSpotAllotmentStrategy) {
        this.floorList = floorList;
        this.gateList = gateList;
        this.parkingLotStatus = parkingLotStatus;
        this.parkingSpotAllotmentStrategy = parkingSpotAllotmentStrategy;
    }

    public List<Floor> getFloorList() {
        return floorList;
    }

    public void setFloorList(List<Floor> floorList) {
        this.floorList = floorList;
    }

    public List<Gate> getGateList() {
        return gateList;
    }

    public void setGateList(List<Gate> gateList) {
        this.gateList = gateList;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public ParkingSpotAllotmentStrategy getParkingLotStrategy() {
        return parkingSpotAllotmentStrategy;
    }

    public void setParkingLotStrategy(ParkingSpotAllotmentStrategy parkingLotStrategy) {
        this.parkingSpotAllotmentStrategy = parkingLotStrategy;
    }

    public ParkingSpot getParkingSpot(VehicleType type) throws ParkingSpotUnavailableException {
        return parkingSpotAllotmentStrategy.getParkingSpot(type, this);
    }
}
