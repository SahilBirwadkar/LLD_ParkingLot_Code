package Models;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private  int FloorNumber;
    private  List<ParkingSpot> parkingSpotList;

    public Floor(int floorNumber) {
        FloorNumber = floorNumber;
        this.parkingSpotList = new ArrayList<ParkingSpot>();
    }

    public int getFloorNumber() {
        return FloorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        FloorNumber = floorNumber;
    }

    public List<ParkingSpot> getParkingSpotList() {
        return parkingSpotList;
    }

    public void setParkingSpotList(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpotList;
    }
}
