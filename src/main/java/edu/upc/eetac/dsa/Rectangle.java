package edu.upc.eetac.dsa;

public class Rectangle extends Figura{
    //Atributes
    private double base;
    private double height;

    //Methods
    public Rectangle (double base, double height){
        this.base = base;
        this.height = height;
    }

    //We use the @Override annotation to implement the abstract area function
    @Override
    public double area() {
        return base * height;
    }

}