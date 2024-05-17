package Models;

import java.util.Date;

public class Payment {
    private PaymentMode paymentMode;
    private int amount;
    private String refNumber;
    private Date time;
    private PaymentStatus paymentStatus;

    public Payment(PaymentMode paymentMode, int amount, String refNumber, Date time, PaymentStatus paymentStatus) {
        this.paymentMode = paymentMode;
        this.amount = amount;
        this.refNumber = refNumber;
        this.time = time;
        this.paymentStatus = paymentStatus;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
