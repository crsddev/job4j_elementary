package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax11To2Then11() {
        int left = 11;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 11;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To1To1Then5() {
        int a = 5;
        int b = 1;
        int c = 1;
        int result = Max.max(a, b, c);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax31To25To1To40Then40() {
        int a = 31;
        int b = 25;
        int c = 1;
        int d = 40;
        int result = Max.max(a, b, c, d);
        int expected = 40;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax30To30To1To40Then40() {
        int a = 30;
        int b = 30;
        int c = 1;
        int d = 40;
        int result = Max.max(a, b, c, d);
        int expected = 40;
        Assert.assertEquals(result, expected);
    }

}