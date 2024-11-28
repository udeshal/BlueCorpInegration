package com.example.bluecorpsys;

import com.example.bluecorpsys.ReadyForDispatchStore;
import com.example.bluecorpsys.ReadyForDispatch;

public class CSVCreator {
    private static final String CSV_HEADER = "CustomerReference,Load ID,Container Type,Item Code,Item Quantity, Item Weight, Street, City, State, Postal Code, Country\n";
    public String CreateCSV(ReadyForDispatch dispatchObj) {

            StringBuilder csvContent = new StringBuilder();
            csvContent.append(CSV_HEADER);

            csvContent.append(dispatchObj.getSalesOrder()).append(",")
                    .append(dispatchObj.getContainers().getLoadId()).append(",")
                    .append(dispatchObj.getContainers().getContainerType()).append(",")
                    .append(dispatchObj.getContainers().getItems()[0].getItemCode()).append(",")
                    .append(dispatchObj.getContainers().getItems()[0].getQuantity()).append(",")
                    .append(dispatchObj.getContainers().getItems()[0].getCartonWeight()).append(",")
                    .append(dispatchObj.getDeliveryAddress().getStreet()).append(",")
                    .append(dispatchObj.getDeliveryAddress().getCity()).append(",")
                    .append(dispatchObj.getDeliveryAddress().getState()).append(",")
                    .append(dispatchObj.getDeliveryAddress().getPostalCode()).append(",")
                    .append(dispatchObj.getDeliveryAddress().getCountry()).append("\n");

            return csvContent.toString();
            }
        }

