package com.example.oop2set3;

/**
 * Created by T00194823 on 05/10/2017.
 */
public class Computer extends Laptop implements IDable {
private String ID;
private String make;
protected Memory memory;

public Computer()
{
   setID("");
   setMake("");
   setMemory(null);
}

public Computer(String ID, String make, Memory memory)
{
  setID(ID);
  setMake(make);
  setMemory(memory);

}


    @Override
    public void setID(String ID)
    {
        this.ID = ID;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public void setMemory(Memory memory)
    {
        this.memory = memory;
    }

    public String getID()
    {
        return ID;
    }

    public String getMake()
    {
        return make;
    }

    public Memory getMemory()
    {
        return memory;
    }

    public String toString()
    {
      return "\nID: " + getID() + "\nMake: " + getMake() + "\nMemory:" +
     super.toString();
    }
}
