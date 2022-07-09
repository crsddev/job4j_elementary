package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return (left >= right) ? left : right;
    }

    public static int max(int a, int b, int c) {
        int result = 0;
        result = Math.max(a, b);
        if (result >= c) {
            return result;
        } else {
            result = c;
        }
        return result;
    }

    public static int max(int a, int b, int c, int d) {
        int result = 0;
        result = Math.max(a, b);
        int tempRsl = Math.max(c, d);
        if (result >= tempRsl) {
            return result;
        } else {
            result = tempRsl;
        }
        return result;
    }
}