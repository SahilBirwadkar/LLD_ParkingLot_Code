package dtos;

import Models.Ticket;

public class IssueTicketResponse {
   Ticket ticket;
   ResponseStatus status;
   String message;

//    public IssueTicketResponse(Ticket ticket, ResponseStatus status, String message) {
//        this.ticket = ticket;
//        this.status = status;
//        this.message = message;
//    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
