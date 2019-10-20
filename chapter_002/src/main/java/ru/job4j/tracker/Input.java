package ru.job4j.tracker;

public interface Input {
    String ask(String question);
    int askInt(String question);
    int askInt(String question, int max); // метод будет запрашивать ввод данных от пользователя пока пользователь не введет число от 0 до max.
}
