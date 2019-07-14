package ru.job4j.array;
/**
 * 6.6 Двумерный массив.
 * @author Vladislav (fn1235@bk.ru)
 * @version 01
 * @since 2019
 */
public class Matrix {
    /**
     * Произведение строк и стобцов.
     * @param size
     * @return table
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
         for (int line = 0; line <= table[0].length - 1; line++) {
             for (int column = 0; column <= table[0].length - 1; column++) {
                 table[line][column] = (line + 1) * (column + 1);
             }
         }
        return table;
    }
}
