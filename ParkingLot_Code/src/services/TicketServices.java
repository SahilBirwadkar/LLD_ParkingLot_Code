package services;

import Models.*;
import repository.GateRepository;
import repository.ParkingLotRepository;
import repository.TicketRepository;
import repository.VehicleRepository;

import java.util.Date;
import java.util.UUID;

import Exception.*;

public class TicketServices {
    VehicleRepository vehicleRepository;
    ParkingLotRepository parkingLotRepository;

    GateRepository gateRepository;

    TicketRepository ticketRepository;
    Vehicle vehicle;
    ParkingLot parkingLot;

    public TicketServices(VehicleRepository vehicleRepository, GateRepository gateRepository,
                          ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository) {
        this.vehicleRepository = vehicleRepository;
        this.gateRepository = gateRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(String vehicleNumber, VehicleType vehicleType, Long gateId, String owner) throws ParkingLotNotFoundException, GateNotFoundException, ParkingSpotUnavailableException {
        //Create an empty ticket
        //Set entry time
        //Check if vehicle available else create and set vehicle
        //Get parking lot - get floor- get parking spot
        //Generate ticket number
        //Save and return the ticket

        Ticket ticket = new Ticket();

        ticket.setEntryTime(new Date());

        vehicle=vehicleRepository.getVehicleNumber(vehicleNumber);
        if (vehicle==null){
            vehicle=vehicleRepository.createVehicle(vehicleNumber,vehicleType,owner);
        }

        Gate gate = gateRepository.getGateByID(gateId);
        ticket.setGate(gate);

        parkingLot = parkingLotRepository.getParkingLotById(1L);
        ParkingSpot parkingSpot = parkingLot.getParkingSpot(vehicleType);
        ticket.setParkingSpot(parkingSpot);

        ticket.setTicketNumber(vehicleNumber+ UUID.randomUUID());

        ticketRepository.createTicket(ticket);

        return ticket;
    }
}
