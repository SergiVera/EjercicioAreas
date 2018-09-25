package edu.upc.eetac.dsa;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FiguresGeometriquesTest {
    Figura[] v;


    @Before
    public void setUp() {
        Figura q = new Quadrat(3);
        Figura r = new Rectangle(4,8);
        Figura c = new Cercle(4);
        Figura t = new Triangle(10/3,2);

        this.v = new Figura[]{q, r,c,t};
    }

    @After
    public void tearDown() {
        this.v=null;
    }

    @Test
    public void testSuma() {

        Assert.assertEquals(94.0, FiguresGeometriques.suma(v), 1);

    }

    @Test
    public void testSort() {

        Assert.assertEquals(Quadrat.class, v[0].getClass());

        FiguresGeometriques.sort(v);

        Assert.assertEquals(Cercle.class, v[0].getClass());
        Assert.assertEquals(50, v[0].area(), 1);


    }

}
