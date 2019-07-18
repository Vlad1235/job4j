package ru.job4j.array;
/**
  *@author Vladislav (fn1235@bk.ru)
  *@version 01
   *@since 2019
 */

import org.junit.Test;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder; //метод arrayContainingInAnyOrder()
import static org.junit.Assert.*;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        ArrayDuplicate msv = new ArrayDuplicate();
        String[] input = new String[] {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] output = new String[] {"Привет", "Мир", "Супер"};
        String[] result = msv.arrayDuplicate(input);
        assertThat(result, arrayContainingInAnyOrder(output)); // не использовать Is, так как итоговая последовательность уникальных значений изначально не известна.
    }
    @Test
    public void whenRemoveDuplicatesThenArray() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        ArrayDuplicate msv = new ArrayDuplicate();
        String[] input = new String[] {"Hello", "Hello", "Hello", "Hello", "Hello", "Hello", "Hello"};
        String[] output = new String[] {"Hello"};
        String[] result = msv.arrayDuplicate(input);
        assertThat(result, arrayContainingInAnyOrder(output)); // не использовать Is, так как итоговая последовательность уникальных значений изначально не известна.
    }
}