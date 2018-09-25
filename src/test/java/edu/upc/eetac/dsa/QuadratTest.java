package edu.upc.eetac.dsa;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuadratTest {
    Figura q;


    @Before
    public void setUp() {
        this.q = new Quadrat(3);
    }

    @After
    public void tearDown() {
        this.q=null;
    }

    @Test
    public void testQuadrat() {

        Assert.assertEquals(9.0, q.area(), 0);

    }

    @Test
    public void testQuadrat2() {
        Figura q2 = new Quadrat(2);

        Assert.assertEquals(4.0, q2.area(), 0);

    }

}
