package ru.job4j.array;
/**
 * @author Vladislav (fn1235@bk.ru)
 * @version 01
 * @since 2019
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {
    @Test
    public void when2on2() {
        Matrix matrix = new Matrix();
        int[][] table = matrix.multiple(3);
        int[][] expect = {{1, 2, 3}, {2, 4, 6}, {3, 6, 9}};
        assertThat(table, is(expect));
    }
}
