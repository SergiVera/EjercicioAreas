package edu.upc.eetac.dsa;



public abstract class Figura implements Comparable<Figura> {
    public abstract double area();

    public int compareTo(Figura b){
        int res=0;
        res = (int)(this.area() - b.area())*-1;
        return res;
    }
}

