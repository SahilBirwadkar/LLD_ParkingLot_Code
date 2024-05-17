import Controller.TicketController;
import Models.*;
import dtos.IssueTicketRequest;
import dtos.IssueTicketResponse;
import repository.GateRepository;
import repository.ParkingLotRepository;
import repository.TicketRepository;
import repository.VehicleRepository;
import services.TicketServices;
import strategy.FirstEmptyAllotmentStrategy;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("Parking Lot!");

        Gate gate = new Gate(GateType.ENTRY, 1l,GateStatus.WORKING);

        Floor floor1 = new Floor(1);

        for(int i=1; i<=10; i++) {
            floor1.getParkingSpots().add(
                    new ParkingSpot(VehicleType.FOUR_WHEELER, ParkingSpotStatus.AVAILABLE, i,floor1));
        }

        ArrayList<Floor> floors = new ArrayList<Floor>();
        floors.add(floor1);
        ArrayList<Gate> gates = new ArrayList<Gate>();
        gates.add(gate);

        ParkingLot parkingLot = new ParkingLot(
                floors, gates, ParkingLotStatus.ACTIVE, new FirstEmptyAllotmentStrategy());


        GateRepository gateRepository = new GateRepository();
        gateRepository.getGates().put(1l, gate); //saving the gate in db

        VehicleRepository vehicleRepository = new VehicleRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        parkingLotRepository.getParkingLotMap().put(1l, parkingLot);//saving the parkinglot in db

        TicketRepository ticketRepository = new TicketRepository();


        TicketServices ticketService =
                new TicketServices(vehicleRepository,gateRepository,
                        parkingLotRepository, ticketRepository);

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketRequest issueTicketRequest = new IssueTicketRequest(
                "KA-02", VehicleType.FOUR_WHEELER, "Akash",
                1l);
        IssueTicketResponse ticketResponse = ticketController.issueTicket(issueTicketRequest);
        System.out.println(ticketResponse);
    }
}
