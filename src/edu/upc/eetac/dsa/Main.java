package edu.upc.eetac.dsa;

public class Main {

    public static void main(String[] args) {
        //Instanciar objetos
        Square s = new Square(3);
        Rectangle r = new Rectangle(4,8);
        Cercle c = new Cercle(4);
        Triangle t = new Triangle(10/3,2);

        //Imprimir areas por consola
        System.out.printf("Area Square: \t\t" + s.area() + "\n");
        System.out.printf("Area Rectangle: \t" + r.area() + "\n");
        System.out.printf("Area Cercle: \t\t" + c.area() + "\n");
        System.out.printf("Area Triangle: \t\t" + t.area() + "\n");
    }
}
