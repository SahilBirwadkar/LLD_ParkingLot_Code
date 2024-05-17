package dtos;

import Models.VehicleType;

public class IssueTicketRequest {
    String vehicleNumber;
    VehicleType vehicleType;
    String owner;
    Long gateId;

    public IssueTicketRequest(String vehicleNumber, VehicleType vehicleType, String owner, Long gateId) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.owner = owner;
        this.gateId = gateId;
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

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }
}
