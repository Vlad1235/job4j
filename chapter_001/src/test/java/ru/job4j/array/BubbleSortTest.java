package ru.job4j.array;
/**
 * @author Vladislav (fn1235@bk.ru)
 * @version 01
 * @since 2019
 */

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class BubbleSortTest {
    @Test
    public void sortirovkaPuzirkom() {
        BubbleSort bsrt = new BubbleSort();
        int[] input = new int[] {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] result = bsrt.sortPuzrk(input);
        int[] expect = new int[]{0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(result, is(expect));


    }
}
