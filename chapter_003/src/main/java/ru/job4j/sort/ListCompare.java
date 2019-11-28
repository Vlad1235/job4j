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
        if (left.length()>right.length()) return 1;
        if (left.length()<right.length()) return -1;
        else return 0;

    }
}
