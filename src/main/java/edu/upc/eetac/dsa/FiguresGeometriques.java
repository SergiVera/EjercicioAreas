package edu.upc.eetac.dsa;

import java.util.Arrays;
import java.util.Comparator;

public class FiguresGeometriques {

    //Adding sort function
    static void sort(Figura[] f) {
        Arrays.sort(f);
    }

    //Adding suma function
    static double suma(Figura[] l){
        double suma = 0;
        for(Figura f:l){
            suma += f.area();
        }
        return suma;
    }
}
