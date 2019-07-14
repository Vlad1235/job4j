package ru.job4j.array;
/**
 * 6.5 Сортировка массива методом пузырька
 * @author Vladislav (fn1235@bk.ru)
 * @version 01
 * @since 2019
 */
public class BubbleSort {
    /**
     * Сортироровка методом пузырька.
     * @param msv
     * @return msv
     */
    public int[] sortPuzrk(int[] msv) {
         for (int i = msv.length - 1; i >= 0; i--) {
             for (int j = 0; j < i; j++) {
                 if (msv[j] > msv[j + 1]) {
                     int temp = msv[j];
                     msv[j] = msv[j + 1];
                     msv[j + 1] = temp;
                 }
             }
         }
         return msv;
    }
}