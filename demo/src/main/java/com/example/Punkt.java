package com.example;

public class Punkt {
    private int x_koord;
    private int y_koord;

    public Punkt(int x, int y){
        x_koord = x;
        y_koord = y;
    }

    public void setX(int x){
        x_koord = x;
    }
    public void setY(int y){
        y_koord = y;
    }
    public int getX(){
        return x_koord;
    }
    public int getY(){
        return y_koord;
    }
}
