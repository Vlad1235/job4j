package ru.job4j.sort;

import java.util.Comparator;

/**
 * нужно сравнить два слова.Вам нужно реализовать компаратор для сравнения двух массивов символов.
 * Необходимо реализовать поэлементное сравнение двух списков, т.е. сравниваем элементы двух списков, находящихся на одних и тех же позициях (по одним и тем же индексом).
 * Сравнение в лексикографическом порядке.
 * Вы можете использовать
 * String.charAt(int index)
 * Integer.compare(int left, int right),
 * Character.compare(char left, char right);
 */
public class ListCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {

        int result = 0;
        int minL = Math.min(left.length(), right.length());

        for (int i = 0; i < minL; i++) {
            result = left.charAt(i) - right.charAt(i);
            if (result != 0) {
                break;
            }
        }
        return result ==0? left.length()-right.length():result;
    }
}
