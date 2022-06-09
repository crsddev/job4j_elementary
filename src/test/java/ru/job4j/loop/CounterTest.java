package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromTwoToNineThenTwenty() {
        int start = 2;
        int finish = 9;
        int result = Counter.sumByEven(start, finish);
        int expected = 20;
        Assert.assertEquals(expected, result);
    }
}