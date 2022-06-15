package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to2() {
        int[] input = {1, 2, 3, 4, 5, 20};
        int source = 1;
        int dest = 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 3, 2, 4, 5, 20};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3to1() {
        int[] input = {41, 231, 131, 412, 1, 0, 40, 15};
        int source = 3;
        int dest = 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {41, 412, 131, 231, 1, 0, 40, 15};
        Assert.assertArrayEquals(expected, result);
    }

}