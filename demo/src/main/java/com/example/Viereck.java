package com.example;

public class Viereck {
    private Punkt punkt1;
    private Punkt punkt2;
    private Punkt punkt3;
    private Punkt punkt4;

    public Viereck(Punkt p1, Punkt p2, Punkt p3, Punkt p4){
        punkt1 = p1;
        punkt2 = p2;
        punkt3 = p3;
        punkt4 = p4;
    }

    public void setP1(Punkt p){
        punkt1 = p;
    }
    public void setP2(Punkt p){
        punkt2 = p;
    }
    public void setP3(Punkt p){
        punkt3 = p;
    }
    public void setP4(Punkt p){
        punkt4 = p;
    }

    public Punkt getP1(){
        return punkt1;
    }
    public Punkt getP2(){
        return punkt2;
    }
    public Punkt getP3(){
        return punkt3;
    }
    public Punkt getP4(){
        return punkt4;
    }
}
