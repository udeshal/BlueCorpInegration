package com.example.bluecorpsys;

import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

//Actual REST API Class
@RestController
@RequestMapping(path = "/ReadyDispatches")
public class BlueCorpRestController {

    @Autowired
    private ReadyForDispatchStore readyForDispatchStore;
    @PostMapping(path = "/",consumes = "application/json",produces = "application/json")
    public ResponseEntity<Object> addReadyDispatch(@RequestBody ReadyForDispatch readyForDispatch){
        Integer orderId = 1;
        CSVCreator csvCreator = new CSVCreator();
        String csvContent;
        SFTPClient sftpClient = new SFTPClient();

        readyForDispatchStore.addDispatches(readyForDispatch);
        csvContent = csvCreator.CreateCSV(readyForDispatch);
        sftpClient.uploadToSFTP(csvContent);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(orderId).toUri();
        return ResponseEntity.created(location).build();
    }
}
