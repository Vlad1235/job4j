package ru.job4j.TrackerSingleton;

import ru.job4j.tracker.Item;

/**
 * Lazy loading.
 * Для того, чтобы закрыть возможность создавать экземпляр класса, нам нужно
 * явно создать конструтор по умолчанию и присвоить ему модификатор private.
 *
 * Здесь главный момент это поле instance, которое содержит экземпляр объекта и метод getInstance().
 * Метод getInstance() - при вызове метода, проверяет статическое поле instance,
 * если поле не загружено, оно инициализирует его новосозданном объектом.
 */
public class trackerSingle3 {
    private static trackerSingle3 instance;

    private trackerSingle3(){

    }
    public static trackerSingle3 getInstance(){
        if (instance == null){
            instance = new trackerSingle3();
        }
        return instance;
    }
    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        trackerSingle3 trackerSingle3 = ru.job4j.TrackerSingleton.trackerSingle3.getInstance();
    }
}
