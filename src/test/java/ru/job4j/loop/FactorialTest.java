package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int actual = 5;
        int expected = 120;
        int result = Factorial.calc(actual);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int actual = 0;
        int expected = 1;
        int result = Factorial.calc(actual);
        Assert.assertEquals(result, expected);

    }
}