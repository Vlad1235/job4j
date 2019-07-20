package ru.job4j.array;
/**
 *
 * @author Vladislav (fn1235@bk.ru)
 * @version 01
 * @since 2019
 */

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int index = 1; index < data.length; index++) {
                if (data[0] == data[index]) {
                    result = true;
            } else {
                    result = false;
                    break;
                }
        }
        return result;
    }
}