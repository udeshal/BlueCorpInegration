package com.example.bluecorpsys;

import java.util.ArrayList;
import java.util.List;

//Class to Store ReadyForDispatchItems
public class ReadyForDispatches {
    private List<ReadyForDispatch>  readyForDispatchList;
    public void setReadyForDispatchList(List<ReadyForDispatch> readyForDispatchList) {
        this.readyForDispatchList = readyForDispatchList;
    }
    public List<ReadyForDispatch> getReadyForDispatchList() {
        return readyForDispatchList;
    }
}
