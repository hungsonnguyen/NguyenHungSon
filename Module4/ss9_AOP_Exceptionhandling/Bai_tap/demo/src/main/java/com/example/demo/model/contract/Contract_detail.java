package model.contract;

public class Contract_detail {
    private int contract_detail;
    private int contract_id;
    private int attach_service_id;

    private int quantity;

    public Contract_detail(int contract_detail, int contract_id, int attach_service_id, int quantity) {
        this.contract_detail = contract_detail;
        this.contract_id = contract_id;
        this.attach_service_id = attach_service_id;
        this.quantity = quantity;
    }

    public int getContract_detail() {
        return contract_detail;
    }

    public void setContract_detail(int contract_detail) {
        this.contract_detail = contract_detail;
    }

    public int getContract_id() {
        return contract_id;
    }

    public void setContract_id(int contract_id) {
        this.contract_id = contract_id;
    }

    public int getAttach_service_id() {
        return attach_service_id;
    }

    public void setAttach_service_id(int attach_service_id) {
        this.attach_service_id = attach_service_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
