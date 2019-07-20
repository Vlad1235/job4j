package ru.job4j.condition;
/**
 * @author Vladislav (fn1235@bk.ru)
 * @version $Id$
 * @since 0.1
 */
public class MultiMax {
    /**
     * @param first
     * @param second
     * @param third
     * @return result
     */
    public int max(int first, int second, int third) {
        int result = first;
        if (first > second) {
            result = first;
        } else {
            result = second;
        }
        if (result < third) {
            result = third;
        }
        return result;
    }
}
