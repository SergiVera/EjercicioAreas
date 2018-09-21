package edu.upc.eetac.dsa;

public class Square extends Rectangle {
    //Atributes
    public Square(double l) {
        super(l, l);
    }

    //We use the @Override annotation to implement the abstract area function
    @Override
    public double area() {
        return super.area();
    }
}
