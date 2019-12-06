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
           for (int i=0;i<left.length();i++){
               for (int j = 0;j<right.length();j++){
                    if(left.charAt(i)-right.charAt(j)==0) return 0;
                    if (left.charAt(i)-right.charAt(j)>0) return 1;
                    if (left.charAt(i)-right.charAt(j)<0) return -1;
               }
           }
    }
}
