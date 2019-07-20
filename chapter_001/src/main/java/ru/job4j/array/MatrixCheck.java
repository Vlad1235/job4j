package ru.job4j.array;
/**
 * 6.7 Квадратный массив заполнен True or False
 * @author Vladislav (fn1235@bk.ru)
 * @version 01
 * @since 2019
 */
public class MatrixCheck {
    /**
     * Проверка диагоналей массива.
     * @param data
     * @return result
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
            for (int index = 1; index <= data.length - 1; index++) {
                if (data[0][0] != data[index][index]) {
                    result = false;
                    break;
                }
                if (data[0][data.length - 1] != data[index][data.length - 1 - index]) {
                        result = false;
                        break;
                }
            }
        return result;
    }
}
