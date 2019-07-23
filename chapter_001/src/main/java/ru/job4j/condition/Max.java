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
     * Наибольшее из 3ех чисел.
     * @param num1
     * @param num2
     * @param numb3
     * @return
     */
    public int max(int num1,int num2,int numb3){
        int tmp = num1 > num2 ? num1 : num2;
        int result = numb3 > tmp ? numb3 : tmp;
        return result;
    }

    /**
     * Наибольшее из 4ех чисел.
     * @param num1
     * @param num2
     * @param numb3
     * @param numb4
     * @return
     */
    public int max(int num1,int num2,int numb3,int numb4){
        int tmp1 = num1 > num2 ? num1 : num2;
        int tmp2 = numb3 > tmp1 ? numb3 : tmp1;
        int result = numb4 > tmp2 ? numb4 : tmp2;
        return result;
    }

}
