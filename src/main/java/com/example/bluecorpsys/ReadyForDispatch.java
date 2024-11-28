package com.example.bluecorpsys;

public class ReadyForDispatch {
    private Integer controlNumber;
    private String salesOrder;
    private Container containers;
    private DeliveryAddress deliveryAddress;
    public ReadyForDispatch() {}
    public ReadyForDispatch(Integer controlNumber, String salesOrder, Container containers, DeliveryAddress deliveryAddress) {
        this.controlNumber = controlNumber;
        this.salesOrder = salesOrder;
        this.containers = containers;
        this.deliveryAddress = deliveryAddress;
    }
    public Integer getControlNumber() {
        return controlNumber;
    }
    public void setControlNumber(Integer controlNumber) {
        this.controlNumber = controlNumber;
    }
    public String getSalesOrder() {
        return salesOrder;
    }
    public void setSalesOrder(String salesOrder) {
        this.salesOrder = salesOrder;
    }
    public Container getContainers() {
        return containers;
    }
    public void setContainers(Container containers) {
        this.containers = containers;
    }
    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }
    public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
