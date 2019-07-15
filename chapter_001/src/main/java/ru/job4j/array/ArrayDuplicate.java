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

        int noRepeat = array.length;
        for (int cycl1 = 0; cycl1 < noRepeat; cycl1++) {
            for (int cycl2 = 1; cycl2 < noRepeat - cycl1; cycl2++) {
                if (array[cycl1].equals(array[cycl2])) {
                    array[cycl1] = array[noRepeat - 1];
                    noRepeat--;
                }
            }
        }
        return Arrays.copyOf(array, noRepeat);
    }
}
