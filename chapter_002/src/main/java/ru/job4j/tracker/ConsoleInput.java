package ru.job4j.tracker;

import java.util.Scanner;

/**
 * класс, который реализует интерфейс Input и который внутри будет работать с Scanner.
 * Этим мы разрываем прямую связь между классом StartUI и системой ввода-вывода
 */
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
    public int askInt(String question, int max) { //В методе askInt(String question, int max) мы проверяет диапазон и выкидываем исключение
        int select = askInt(question);
        if (select < 0 || select >= max) {
            throw new IllegalStateException(String.format("Out of about %s > [0, %s]", select, max));
        }
        return select;
    }
}
