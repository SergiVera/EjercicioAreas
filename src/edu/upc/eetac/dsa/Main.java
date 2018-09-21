package edu.upc.eetac.dsa;

public class Main {

    public static void main(String[] args) {
        //Instanciar objetos
        Figura s = new Square(3);
        Figura r = new Rectangle(4,8);
        Figura c = new Cercle(4);
        Figura t = new Triangle(10/3,2);

        //Imprimir areas por consola
        System.out.printf("Area Square: \t\t" + s.area() + "\n");
        System.out.printf("Area Rectangle: \t" + r.area() + "\n");
        System.out.printf("Area Cercle: \t\t" + c.area() + "\n");
        System.out.printf("Area Triangle: \t\t" + t.area() + "\n");
    }
}
