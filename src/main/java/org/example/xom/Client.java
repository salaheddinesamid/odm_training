package org.example.xom;

import java.util.Date;

public class Client
{
    // Define client's information
    public int id;
    public String fullName;
    public String nationalId;

    public Date getFirstSale() {
        return firstSale;
    }

    public void setFirstSale(Date firstSale) {
        this.firstSale = firstSale;
    }

    public Date getLastSale() {
        return lastSale;
    }

    public void setLastSale(Date lastSale) {
        this.lastSale = lastSale;
    }

    public Date firstSale;
    public Date lastSale;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int age;
    public String gender;
    public String email;
    public String phone;
    public String address;
    public boolean isMember;
    public int discount;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isMember() {
        return isMember;
    }

    public void setMember(boolean member) {
        isMember = member;
    }



    public int amountOfSales;

    public int getAmountOfSales() {
        return amountOfSales;
    }

    public void setAmountOfSales(int amountOfSales) {
        this.amountOfSales = amountOfSales;
    }
}
