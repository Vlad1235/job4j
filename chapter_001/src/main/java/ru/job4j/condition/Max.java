package ru.job4j.condition;
/**
 * @author Vladislav (fn1235@bk.ru)
 * @version $Id$
 * @since 0.1
 */
public class Max {
    /**
     * Тернарное условие.
     * @param left
     * @param right
     * @return result
     */
    public int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }
}
