package com.example;

public class Punkt {
    private int x_koord;
    private int y_koord;

    public void Punkt(int x, int y){
        x_koord = x;
        y_koord = y;
    }

    public void setPunkt(Punkt p, int x, int y){
        p.x_koord = x;
        p.y_koord = y;
    }
}
