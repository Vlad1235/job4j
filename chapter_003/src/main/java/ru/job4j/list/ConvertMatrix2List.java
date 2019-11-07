package ru.job4j.list;

import java.util.*;

/**
 * public List<Integer> toList (int[][] array) {} - в метод приходит двумерный массив целых чисел, необходимо пройтись по
 * всем элементам массива и добавить их в List<Integer>.
 */
public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<Integer>();
            for (int[] i : array) {
                for (int j:i) {
                    list.add(j);
                }
            }
        return list;
    }
}
