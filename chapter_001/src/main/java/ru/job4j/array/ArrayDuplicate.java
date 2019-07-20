package ru.job4j.array;
/**
 * 6.8 Удаление дубликатов в массиве.
 * @author Vladislav (fn1235@bk.ru)
 * @version 01
 * @since 2019
 */
import java.util.Arrays;

public class ArrayDuplicate {

    public String[] arrayDuplicate(String[] array) {
        /*
         берем концепцию, что все массивы уникальны изначально . Доказать или опровергнуть.
         уменьшение уникальных значений на 1 если мы находим повторяющийся.
         проверка если мы проверямое значение меняем с последним в массиве и вдруг оно такое же в цифре, как и сам элемент, поэтому надо еще раз пройтись по массиву.
         */
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out+1; in < unique; in++) {
                if (array[out].equals(array[in])) { //доказательство. Опровержение.
                    array[in] = array[unique - 1];
                    unique--;//
                    in--;//
                }
            }
        }
        /*
       метод для обрезания массива от хвоста собранных в нем повторяющихся значений. unique - итоговое колличесво уникальных значений.
         */
        return Arrays.copyOf(array, unique);
    }
}
