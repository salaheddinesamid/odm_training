package org.example.xom.bom;

import java.util.Date;

public class ClientBom {

    public float id;
    public String name;
    public int amountOfSales;
    public Date dateOfFirstSale;

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfSales() {
        return amountOfSales;
    }

    public void setAmountOfSales(int amountOfSales) {
        this.amountOfSales = amountOfSales;
    }

    public Date getDateOfFirstSale() {
        return dateOfFirstSale;
    }

    public void setDateOfFirstSale(Date dateOfFirstSale) {
        this.dateOfFirstSale = dateOfFirstSale;
    }

    public Date getDateOfLastSale() {
        return dateOfLastSale;
    }

    public void setDateOfLastSale(Date dateOfLastSale) {
        this.dateOfLastSale = dateOfLastSale;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Date dateOfLastSale;
    public int discount;
}
