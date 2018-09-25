package edu.upc.eetac.dsa;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RectangleTest {
    Figura r;


    @Before
    public void setUp() {
        this.r = new Rectangle(8,4);
    }

    @After
    public void tearDown() {
        this.r=null;
    }

    @Test
    public void testRectanble() {

        Assert.assertEquals(32.0, r.area(), 0);

    }

    @Test
    public void testRectangle2() {
        Figura r2 = new Rectangle(2, 5);

        Assert.assertEquals(10.0, r2.area(), 0);
        Assert.assertNotEquals(100000000.0, r.area(), 0);

    }

}
