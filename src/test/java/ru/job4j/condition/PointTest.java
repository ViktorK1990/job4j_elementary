package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenA02B02then00() {
        Point a = new Point(0, 2);
        Point b = new Point(0, 2);
        double expected = 0.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenA03B12then141() {
        Point a = new Point(0, 3);
        Point b = new Point(1, 2);
        double expected = 1.41;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenTochka123Huechka314then141() {
        Point a = new Point(1, 2,3);
        Point b = new Point(3, 1,4);
        double expected = 2.44;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}