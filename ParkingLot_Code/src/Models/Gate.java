package Models;

public class Gate {
    private GateType gateType;
    private Long gateId;
    private Operator operator;
    private GateStatus gateStatus;

    public Gate(GateType gateType, Long gateId, GateStatus gateStatus) {
        this.gateType = gateType;
        this.gateId = gateId;
        this.gateStatus = gateStatus;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public Long getGateNumber() {
        return gateId;
    }

    public void setGateNumber(Long gateId) {
        this.gateId = gateId;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }
}
