package ru.job4j.calculator;
/**
 * Программа расчета идеального веса Fit.
 *  @author Vladislav (fn1235@bk.ru)
 */
public class Fit {
    /**
     * Идеальный вес для мужщины.
     *
     * @param height Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        double manPerfWeight = (height - 100) * 1.15;
        return manPerfWeight;
    }

    /**
     * Идеальный вес для женщины.
     *
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        double womanPerfWeight = (height - 110) * 1.15;
        return womanPerfWeight;
    }
}
