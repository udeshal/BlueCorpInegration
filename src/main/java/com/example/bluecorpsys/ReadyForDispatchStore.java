package com.example.bluecorpsys;

import org.springframework.stereotype.Repository;
import com.example.bluecorpsys.ReadyForDispatches;

//Class to Store the Received ReadToDispatch JSON Object
@Repository
public class ReadyForDispatchStore {
    private static ReadyForDispatches list = new ReadyForDispatches();
    public void addDispatches(ReadyForDispatch rd) {
        list.getReadyForDispatchList().add(rd);
    }
}
