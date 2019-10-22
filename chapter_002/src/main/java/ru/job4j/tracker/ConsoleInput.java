package ru.job4j.tracker;

import java.util.Scanner;

public class ConsoleInput implements Input {

    public String ask(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        return scanner.nextLine();
    }

    @Override
    public int askInt(String question) {
        return Integer.valueOf(ask(question));
    }

    /**
     * методе askInt(String question, int max) мы проверяем диапазон и выкидываем исключение.
     * @param question
     * @param max
     * @return
     */
    @Override
    public int askInt(String question, int max) {
        int select = askInt(question);
        if (select < 0 || select >= max) {
            throw new IllegalStateException(String.format("Out of about %s > [0, %s]", select, max));
        }
        return select;
    }
}
