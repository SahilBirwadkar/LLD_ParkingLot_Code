package Models;

import java.util.Date;
import java.util.List;

public class Bill {
    private Date exitTime;
    private Ticket ticket;
    private  int billAmount;
    private BillStatus status;
    private List<Payment> paymentList;
    private  Gate gate;
    private Operator operator;

    public Bill(Date exitTime, Ticket ticket, int billAmount, BillStatus status, List<Payment> paymentList, Gate gate, Operator operator) {
        this.exitTime = exitTime;
        this.ticket = ticket;
        this.billAmount = billAmount;
        this.status = status;
        this.paymentList = paymentList;
        this.gate = gate;
        this.operator = operator;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(int billAmount) {
        this.billAmount = billAmount;
    }

    public BillStatus getStatus() {
        return status;
    }

    public void setStatus(BillStatus status) {
        this.status = status;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
