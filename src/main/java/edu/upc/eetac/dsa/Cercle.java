package edu.upc.eetac.dsa;

public class Cercle extends Figura {
    //Atributes
    private double radius;

    //Methods
    public Cercle (double radius){
        this.radius = radius;
    }

    //We use the @Override annotation to implement the abstract area function
    @Override
    public double area() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
