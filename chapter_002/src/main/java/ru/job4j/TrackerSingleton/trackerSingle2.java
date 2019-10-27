package ru.job4j.TrackerSingleton;

import ru.job4j.tracker.Item;

/**
 * Eager loading.
 * В JDK 1.5 появилось новое ключевое слово enum.
 * Оно используется для создания ограниченного количество объектов.
 * Чтобы получить экземпляр класса нужно напрямую обратиться к полю INSTANCE
 */
public enum  trackerSingle2 {
    INSTANCE;

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        trackerSingle2 trackerSingle2 = ru.job4j.TrackerSingleton.trackerSingle2.INSTANCE;
    }
}
