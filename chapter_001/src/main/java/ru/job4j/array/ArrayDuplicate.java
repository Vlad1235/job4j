package ru.job4j.array;
/**
 * 6.8 Удаление дубликатов в массиве.
 * @author Vladislav (fn1235@bk.ru)
 * @version 01
 * @since 2019
 */
import java.util.Arrays;

public class ArrayDuplicate {

    public String[] arrayDuplicate(String[] array) {

        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out+1; in < unique; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[unique - 1];
                    unique--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }
}
