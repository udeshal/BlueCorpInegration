package com.example.bluecorpsys;

public class Container {
    private String loadId;
    private String containerType;
    private Item[] items;
    public Container(String loadId, String containerType, Item[] items) {
        this.loadId = loadId;
        this.containerType = containerType;
        this.items = items;
    }
    public String getLoadId() {
        return loadId;
    }
    public void setLoadId(String loadId) {
        this.loadId = loadId;
    }
    public String getContainerType() {
        return containerType;
    }
    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }
    public Item[] getItems() {
        return items;
    }
    public void setItems(Item[] items) {
        this.items = items;
    }
}
