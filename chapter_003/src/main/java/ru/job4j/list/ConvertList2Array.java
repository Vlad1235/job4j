package ru.job4j.list;

import java.util.List;

/**
 * public int[][] toArray (List<Integer> list, int rows) {} - метод toArray должен равномерно разбить лист на количество строк
 * двумерного массива. В методе toArray должна быть проверка - если количество элементов не кратно
 * количеству строк - оставшиеся значения в массиве заполнять нулями.
 *
 * Например в результате конвертации листа со значениями (1,2,3,4,5,6,7)
 * с разбиением на 3 строки должен получиться двумерный массив {{1, 2, 3} {4, 5, 6} {7, 0 ,0}}
 */
public class ConvertList2Array {

    public int[][] toArray2(List<Integer> list, int rows) {
        int cells = ((list.size() / rows) + 1);
        int[][] array = new int[rows][cells];
        int index = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cells;c++) {
                if (index >= list.size()) {
                    array[r][c] = 0;
                } else {
                    array[r][c] = list.get(index);
                    index++;
                }
            }
        }
        return array;
    }
}