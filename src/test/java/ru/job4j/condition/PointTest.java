package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenX3Y4X22Y1then316() {
        int x = 3;
        int y = 4;
        int x2 = 2;
        int y2 = 1;
        double expected = 3.16;
        double out = Point.distance(x, y, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX4Y5X22Y1then316() {
        int x = 4;
        int y = 5;
        int x2 = 2;
        int y2 = 1;
        double expected = 4.47;
        double out = Point.distance(x, y, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }
}