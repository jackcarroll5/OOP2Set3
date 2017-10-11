package com.example.oop2set3;

/**
 * Created by T00194823 on 05/10/2017.
 */
public class Laptop  {
private boolean touchScreen;


public Laptop()
{
   isTouchScreen();

}

public Laptop(boolean touchScreen)
{
   isTouchScreen();

}

public void setTouchScreen(boolean touchScreen)
{
    this.touchScreen = touchScreen;
}

    public boolean isTouchScreen()
    {
        return touchScreen;
    }

    public String toString()
{
    return "\nTouch Screen: " + isTouchScreen();
}



}
