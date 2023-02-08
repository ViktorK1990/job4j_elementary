package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenTochka02Huechka02then00() {
        Point tochka = new Point(0, 2);
        Point huechka = new Point(0, 2);
        double expected = 0.0;
        double out = tochka.distance(huechka);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenTochka03Huechka12then141() {
        Point tochka = new Point(0, 3);
        Point huechka = new Point(1, 2);
        double expected = 1.41;
        double out = tochka.distance(huechka);
        Assert.assertEquals(expected, out, 0.01);
    }

}