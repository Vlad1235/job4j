package ru.job4j.array;
/**
 * @author Vladislav (fn1235@bk.ru)
 * @version 01
 * @since 2019
 */
public class Square {
    /**
     * заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
     * @param bound аргумент
     * @return rst
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = (i + 1) * (i + 1); // Особое внимание.
        }
        return rst;
    }
}
