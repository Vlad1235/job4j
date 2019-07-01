package ru.job4j.converter;

/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
            int euro = value/70;
        return euro  ;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        int dollar = value/60;
        return dollar;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return Рубли.
     */
    public int dollarToRuble(int value) {
        int ruble = value*60;
        return ruble;
    }

    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return Рубли.
     */
    public int euroToRuble(int value) {
        int euro = value*70;
        return 70;
    }
}
