package com.example;

public class Punkt {
    private double x_koord;
    private double y_koord;

    public Punkt(double x, double y){
        x_koord = x;
        y_koord = y;
    }

    public void setX(double x){
        x_koord = x;
    }
    public void setY(double y){
        y_koord = y;
    }
    public double getX(){
        return x_koord;
    }
    public double getY(){
        return y_koord;
    }
}
