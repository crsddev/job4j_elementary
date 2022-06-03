package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float inEuro = 140;
        float inDollar = 210;
        float expectedEuro = 2;
        float expectedDollar = 3;
        float outEuro = Converter.rubleToEuro(inEuro);
        float outDollar = Converter.rubleToEuro(inDollar);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are " + outEuro + " Test result: " + passedEuro);
        System.out.println("210 rubles are " + outDollar + " Test result: " + passedDollar);

    }
}