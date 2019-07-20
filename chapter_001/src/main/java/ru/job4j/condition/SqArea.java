package ru.job4j.condition;
/**
 * @author Vladislav (fn1235@bk.ru)
 * @version $Id$
 * @since 0.1
 */
public class SqArea {
    /**
     * @param p
     * @param k
     * @return s
     */
    public int square(int p, int k) {
         int h = p / (2 * (k + 1));
         int w = h * k;
         int s = w * h;
        return s;
    }
}
