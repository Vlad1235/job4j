package ru.job4j.list;

import javax.print.DocFlavor;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;
/**
 * В этом методе вы должны пройтись по всем элементам всех массивов в списке list и добавить их в один общий лист Integer.
 */
public class ConvertList {
    public List<Integer> convert (List<int[]> list){
    List<Integer> newList= new ArrayList<>();
        for (int[] one:list) {
            for (int two: one) {
                    newList.add(two);
            }
        }
       return newList;
    }
}
