package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double secondSum(double fisrt, double second) {
        return minus(fisrt, second) + difference(fisrt, second);
    }

    public static double allSum(double first, double second) {
        return sum(first, second) + minus(first, second) + difference(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + allSum(50, 20));
        System.out.println("Результат расчета равен: " + secondSum(50, 20));
    }
}