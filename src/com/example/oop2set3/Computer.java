package com.example.oop2set3;

/**
 * Created by T00194823 on 05/10/2017.
 */
public class Computer implements IDable {
private String ID;
private String make;
protected Memory memory;

public Computer()
{
   setID("No ID specified");
   setMake("No make specified");
   setMemory(new Memory());
}

public Computer(String ID, String make,String memType,int memSize)
{
  setID(ID);
  setMake(make);
  setMemory(new Memory(memType,memSize));
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
      return "\nID: " + getID() + "\nMake: " + getMake() +
              (getMemory()).toString();
    }
}
