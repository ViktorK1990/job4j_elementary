package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
public class SqAreaTest {

    @Test
    public void whenP4K1then1() {
        int p = 4;
        double k = 1;
        double expected = 1;
        double out = SqArea.square(4, 1);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenP5K2then1() {
        int p = 5;
        double k = 2;
        double expected = 1.3;
        double out = SqArea.square(5, 2);
        Assert.assertEquals(expected, out, 0.1);
    }
}