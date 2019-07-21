package ru.job4j.condition;
/**
 * @author Vladislav (fn1235@bk.ru)
 * @version $Id$
 * @since 0.1
 */
public class Max {
    /**
     * Тернарное условие.
     * @param left
     * @param right
     * @return result
     */
    public int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    /**
     * Наибольшее из 4ех чисел.
     * @param numb1
     * @param mumb2
     * @param numb3
     * @param numb4
     * @return result
     */
    public int max(int numb1,int mumb2,int numb3,int numb4){
        int result = Math.max(numb4,Math.max(numb3,Math.max(numb1,mumb2)));
        return result;
    }
    /**
     * Наибольшее из 3ех чисел.
     * @param numb1
     * @param mumb2
     * @param numb3
     * @return result
     */
    public int max(int numb1,int mumb2,int numb3){
        int result = Math.max(numb3,Math.max(numb1,mumb2));
        return result;
    }
}
