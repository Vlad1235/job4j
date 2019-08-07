package ru.job4j.tracker;

import java.util.Arrays;

/**
 * Vladislav (fn1235@bk.ru)
 *
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];
    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + Math.random());
    }

    /**
     * Метод замены одной заявки на другую, по данным идентификатора.
     *
     * @param id
     * @param item
     * @return
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int index = 0; index < this.position; index++) {
            if (this.items[index].getId().equals(id)) {
                this.items[index] = item;
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Удаление заявки.
     *
     * @param id
     * @return
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int index = 0; index < this.position; index++) {
            if (this.items[index].getId().equals(id)) {
                System.arraycopy(this.items, index + 1, this.items, index, this.items.length - index - 1);
                position--;
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Вывод списка всех заявок.
     *
     * @return
     */
    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.position);
    }

    /**
     * Поиск по имени в списке заявок.
     *
     * @param key
     * @return
     */
    public Item[] findByName(String key) {
        Item[] newTemp = new Item[position];
        int count = 0;
        for (int index = 0; index != this.position; index++) {
            if (this.items[index].getName().equals(key)) {
                newTemp[count] = this.items[index];
                ++count;
            }
        }
        return Arrays.copyOf(newTemp, count);
    }

    /**
     * Поиск по идентификатору.
     *
     * @param id
     * @return
     */
    public Item findById(String id) {
        Item result = null;
        for (int index = 0; index != this.position; index++) {
            if (this.items[index].getId().equals(id)) {
                result = this.items[index];
                break;
            }
        }
        return result;
    }
}
