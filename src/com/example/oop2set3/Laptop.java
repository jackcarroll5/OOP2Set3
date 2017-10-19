package com.example.oop2set3;

/**
 * Created by T00194823 on 05/10/2017.
 */
public class Laptop extends Computer {
private boolean touchScreen;

public Laptop()
{
    super("No ID specified","No make specified","No type specified",0);
   isTouchScreen(true);

}

public Laptop(String ID,String make,String memType,int memSize,boolean touchScreen)
{
   super(ID,make,memType,memSize);
   isTouchScreen(false);
}

public void setTouchScreen(boolean touchScreen)
{
    this.touchScreen = touchScreen;
}

    public boolean isTouchScreen(boolean b)
    {
        return touchScreen;
    }

    public String toString()
{
    return super.toString() + "\nTouch Screen: " + isTouchScreen(false);
}



}
