package ru.job4j.TrackerSingleton;

import ru.job4j.tracker.Item;

/**
 * Eager loading.
 * Этот вариант вариант похож на trackerSingle3.
 * Основное отличие, мы сразу создаем и инициализируем объект.
 */
public class trackerSingle4 {
        private static final trackerSingle4 INSTANCE = new trackerSingle4();

        private trackerSingle4(){
        }

        public static trackerSingle4 getInstance(){
            return INSTANCE;
        }

        public Item add(Item model) {
            return model;
        }

        public static void main(String[] args) {
            trackerSingle4 trackerSingle4 = ru.job4j.TrackerSingleton.trackerSingle4.getInstance();
        }

}
