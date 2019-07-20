package ru.job4j.array;
/**
 * @author Vladislav (fn1235@bk.ru)
 * @version 01
 * @since 2019
 */
public class Turn {
    /**
     * @param array входной массив.
     * @return массив
     */
    public int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = temp;
        }
        return array;
    }
}

