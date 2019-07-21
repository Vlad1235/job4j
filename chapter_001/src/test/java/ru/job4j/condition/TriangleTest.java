package ru.job4j.condition;

import static org.hamcrest.number.IsCloseTo.closeTo;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Categories;
import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;


public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 0);
        Triangle triangle = new Triangle(first,second,second);

        double result = triangle.area(0, 0, 0, 0, 0, 0);
        double expected = -1;
        assertThat(result, is(expected));
    }
}
