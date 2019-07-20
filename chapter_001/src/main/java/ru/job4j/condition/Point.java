package ru.job4j.condition;
/**
 * @author Vladislav (fn1235@bk.ru)
 * @version $Id$
 * @since 0.1
 */
public class Point {
    /**
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return distance
     */
    public double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        double distance = Math.sqrt(first + second);
        return distance;
    }
}
