package com.example.oop2set3;

/**
 * Created by T00194823 on 10/10/2017.
 */
public class Person {

    private String name;

    public Person()
    {
        setName("");
    }

    public Person(String name)
    {
        setName(name);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }


    public String toString()
    {
        return "\nOwner: " + getName();
    }

}
