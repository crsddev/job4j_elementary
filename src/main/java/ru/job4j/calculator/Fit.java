package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
}

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short heightMale = 175;
        short heightFemale = 165;
        double man = Fit.manWeight(heightMale);
        double woman = Fit.womanWeight(heightFemale);
        System.out.println("Man 175 is " + man);
        System.out.println("Woman 165 is " + woman);
    }

}