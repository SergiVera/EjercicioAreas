package edu.upc.eetac.dsa;

public class Triangle extends Figura{
    //Atributes
    private double base;
    private double height;

    //Methods
    public Triangle (double base, double height){
        this.base = base;
        this.height = height;
    }

    //We use the @Override annotation to implement the abstract area function
    @Override
    public double area() {
        return (base * height)/2;
    }
}
