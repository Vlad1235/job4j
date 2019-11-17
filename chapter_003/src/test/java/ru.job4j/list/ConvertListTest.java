package ru.job4j.list;
import org.junit.Test;
import java.util.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertListTest {
    @Test
    public void TestMethod() {
        ConvertList convertList = new ConvertList();
        int[] arr0 = new int[]{1,2};
        int[] arr1 = new int[]{3,4,5,6};
        List<int[]> list = new ArrayList<>();
        list.add(arr0);
        list.add(arr1);
        List<Integer> finallny = new ArrayList<Integer>();
        Collections.addAll(finallny,1,2,3,4,5,6);
        List<Integer> result = convertList.convert(list);
        assertThat(finallny,is(result));
    }

    @Test
    public void TestMethod2() {
        ConvertList convertList = new ConvertList();
        int[] arr0 = new int[]{4,2};
        int[] arr1 = new int[]{6,4,7,3};
        int[] arr3 = new int[]{5,8,9};
        List<int[]> list = new ArrayList<>();
        list.add(arr0);
        list.add(arr1);
        list.add(arr3);
        List<Integer> finallny = new ArrayList<Integer>();
        Collections.addAll(finallny,4,2,6,4,7,3,5,8,9);
        List<Integer> result = convertList.convert(list);
        assertThat(finallny,is(result));
    }
}