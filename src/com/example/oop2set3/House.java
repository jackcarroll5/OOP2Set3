package com.example.oop2set3;

public class House extends Person {

private String address;
private String type;
private double price;

public House()
 {
     setAddress("No Address Specified");
     setType("No Type Specified");
     setPrice(0);
     super.setName("No owner specified");
 }

public House(String address,String type,double price,String name)
 {
    setAddress(address);
    setType(type);
    setPrice(price);
    super.setName(name);
 }


public void setAddress(String address)
 {
    this.address = address;
 }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public void setName(String name)
    {
        super.setName(name);
    }

    public String getAddress()
    {
        return address;
    }

    public String getType()
    {
        return type;
    }

    public double getPrice()
    {
        return price;
    }

    @Override
    public String getName()
    {
        return super.getName();
    }

    public String toString()
    {
     return "\nAddress: " + getAddress() + "\nType: " + getType() +
             "\nPrice: €" + getPrice() + super.toString();
    }
}