package com.example.oop2set3;

/**
 * Created by T00194823 on 10/10/2017.
 */
public class Memory{
    private String type;
    private int size;

    public Memory()
    {
      setType("");
      setSize(0);
    }

    public Memory(String type, int size)
    {
      setType(type);
      setSize(size);
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public String getType()
    {
        return type;
    }

    public int getSize()
    {
        return size;
    }

    public String toString()
    {
     return "\nType: " + getType() + "\nSize: " + getSize() + " GB";
    }

}
