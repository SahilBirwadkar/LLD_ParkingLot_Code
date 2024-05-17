package Controller;

import Models.Ticket;
import dtos.IssueTicketRequest;
import dtos.IssueTicketResponse;
import dtos.ResponseStatus;
import services.TicketServices;

public class TicketController {
    TicketServices ticketServices;

    public TicketController(TicketServices ticketServices) {
        this.ticketServices = ticketServices;
    }

    public IssueTicketResponse issueTicket(IssueTicketRequest request){
        Ticket ticket=null;
        IssueTicketResponse response = new IssueTicketResponse();
        try {
            ticket=ticketServices.issueTicket(request.getVehicleNumber(), request.getVehicleType(),
                    request.getGateId(), request.getOwner());
            response.setTicket(ticket);
            response.setStatus(ResponseStatus.SUCCESS);
            response.setMessage("Ticket generation Successful");
        }catch (Exception e){
            System.out.println("Exception :" + e.getMessage());
            response.setTicket(null);
            response.setMessage(e.getMessage());
            response.setStatus(ResponseStatus.FAILURE);
        }
        return response;
    }
}
