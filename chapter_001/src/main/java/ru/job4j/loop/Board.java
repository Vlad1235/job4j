package ru.job4j.loop;
/**
 * @author Vladislav (fn1235@bk.ru)
 * @version $Id$
 * @since 0.1
 */
public class Board {
    /**
     * @param width
     * @param height
     * @return
     */
        public String paint(int width, int height) {
            StringBuilder screen = new StringBuilder();
            String ln = System.lineSeparator();
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    /*
                    условие проверки, что писать пробел или X
                    Выше в задании мы определили закономерность, когда нужно проставлять X
                     */
                    if ((((i + j) % 2) == 0)) {
                        screen.append("X");
                    } else {
                        screen.append(" ");
                    }
                }
                screen.append(ln); // добавляем перевод на новую строку.
            }
            return screen.toString();
        }
}
