package repository;

import Models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

import Exception.ParkingLotNotFoundException;

public class ParkingLotRepository {
    HashMap<Long, ParkingLot> parkingLotHashMap = new HashMap<>();

    public HashMap<Long, ParkingLot> getParkingLotHashMap(){
        return parkingLotHashMap;
    }

    public void setParkingLotHashMap(HashMap<Long, ParkingLot> parkingLotHashMap) {
        this.parkingLotHashMap = parkingLotHashMap;
    }

    public ParkingLot getParkingLotById(long id) throws ParkingLotNotFoundException {
        if (parkingLotHashMap.containsKey(id)){
            return parkingLotHashMap.get(id);
        }
        throw new ParkingLotNotFoundException();
    }

    public Map<Long, ParkingLot> getParkingLotMap() {
        return parkingLotHashMap;
    }
}
