package ru.mirea;

public class Hand {
    public double length = 0;
    private boolean handRaised = false;
    public void handRaised(boolean a){
        handRaised = a;
    }
    public boolean getHandRaised(){
        return handRaised;
    }
}
