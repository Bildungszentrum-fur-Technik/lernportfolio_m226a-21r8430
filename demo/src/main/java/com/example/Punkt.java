package com.example;

public class Punkt {
    private double x_koord;
    private double y_koord;
    private double minusrange;
    private double plusrange;


    public Punkt(double x, double y){
        if(x<=100 && x >= -100 && y<=100 && y<=-100){

        x_koord = x;
        y_koord = y;
        }
        else{
            System.out.println("Ungültige Eingabe, keine Werte unter oder über 100 erlaubt (:");
        }
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
