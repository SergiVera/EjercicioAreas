package edu.upc.eetac.dsa;

public class Main {

    public static void main(String[] args) {
        //Instanciar objetos
        Figura q = new Quadrat(3);
        Figura r = new Rectangle(4,8);
        Figura c = new Cercle(4);
        Figura t = new Triangle(10/3,2);

        Figura[] v = {q, r,c,t};

        //Imprimir areas por consola
        System.out.printf("Area Square: \t\t" + q.area() + "\n");
        // assertEquals(q.area(), 9.0)


        System.out.printf("Area Rectangle: \t" + r.area() + "\n");
        System.out.printf("Area Cercle: \t\t" + c.area() + "\n");
        System.out.printf("Area Triangle: \t\t" + t.area() + "\n");


        double res = 0;

        res =FiguresGeometriques.suma(v);
        System.out.println("suma: "+res);

        for (Figura f: v) {
            System.out.println(" "+f.getClass().getSimpleName()+" "+f.area());
        }

        FiguresGeometriques.sort(v);

        System.out.println(" ");

        for (Figura f: v) {
            System.out.println(" "+f.getClass().getSimpleName()+" "+f.area());
        }

    }
}
