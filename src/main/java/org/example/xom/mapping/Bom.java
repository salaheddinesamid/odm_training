package org.example.xom.mapping;

import org.example.xom.Client;
import org.example.xom.bom.ClientBom;

public class Bom {
    public static ClientBom mapToBom(Client client){
        ClientBom clientBom = new ClientBom();
        clientBom.setId(client.getId());
        clientBom.setName(client.getFullName());
        clientBom.setAmountOfSales(client.getAmountOfSales());
        clientBom.setDiscount(client.getDiscount());
        return clientBom;
    }
}
