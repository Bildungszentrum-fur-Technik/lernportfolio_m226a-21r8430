package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Punkt p1 = new Punkt(3,5);
        Punkt p2 = new Punkt(5,10);
        Punkt p3 = new Punkt(20,15);
        Dreieck dreieck1 = new Dreieck(p1, p2, p3);
        System.out.println("Punkte von Dreieck");
        System.out.println("Punkt1: " + dreieck1.getP1().getX() + "," + dreieck1.getP1().getY());
        System.out.println("Punkt1: " + dreieck1.getP2().getX() + "," + dreieck1.getP2().getY());
        System.out.println("Punkt1: " + dreieck1.getP3().getX() + "," + dreieck1.getP3().getY());
    }
}
