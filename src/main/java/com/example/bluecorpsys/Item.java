package com.example.bluecorpsys;

public class Item {
    private String itemCode;
    private Integer quantity;
    private Integer cartonWeight;

    public Item() {
    }

    public Item(String itemCode, Integer quantity, Integer cartonWeight) {
        super();
        this.itemCode = itemCode;
        this.quantity = quantity;
        this.cartonWeight = cartonWeight;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getCartonWeight() {
        return cartonWeight;
    }

    public void setCartonWeight(Integer cartonWeight) {
        this.cartonWeight = cartonWeight;
    }
}
