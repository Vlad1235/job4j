package ru.job4j.array;

/**
 * Обертка над строкой.
 *  * @author Vladislav (fn1235@bk.ru)
 *  * @version 01
 *  * @since 2019
 */
public class ArrayChar {

    /**
     * Проверяет. что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startsWith(String word, String prefix) {
        boolean result = true;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();
            for (int i = 0; i <= pref.length - 1; i++) { // проверить. что массив data имеет первые элементы одинаковые с value
                if (pref[i] == wrd[i]) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        return result;
    }
}
