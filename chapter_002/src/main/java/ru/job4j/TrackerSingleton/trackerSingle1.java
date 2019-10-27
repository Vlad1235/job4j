package ru.job4j.TrackerSingleton;

import ru.job4j.tracker.Item;

/**
 * Lazy loading.
 * Последний вариант объект класса находиться в поле внутреннего класса.
 */
public class trackerSingle1 {
    private trackerSingle1(){
    }

    public static trackerSingle1 getInstance(){
        return Holder.INSTANCE;
    }

    private static class Holder{
        private static final trackerSingle1 INSTANCE = new trackerSingle1();
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        trackerSingle1 trackerSingle1 = ru.job4j.TrackerSingleton.trackerSingle1.getInstance();
    }
}
