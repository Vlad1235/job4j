package ru.job4j.tracker;


/**
 * @Vladislav
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
     * @return Уникальный ключ.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + Math.random());
    }
    /**
     * Метод редактирования заявок
     * @param id
     * @param item
     * @return
     */
    public boolean replace(String id, Item item){
//        boolean result = false;
//        if(findById().equals(id)){
//            result = true;
//        }
//        return result;
    }

    /**
     * Метод удаления заявок
     * @param id
     * @return
     */
    public boolean delete(String id){
            int[] novMassive = new int[];
       if(String.valueOf(findById(id)).equals(id)){
           System.arraycopy(items,(new String(items).indexOf(id))-1,novMassive,0);
       }
    }
    /**
     * Метод получения списка всех заявок
     * @return
     */
    public Item[] findAll(){
        Item[] result = new Item[this.position];
        for(int index = 0; index != this.position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }
    /**
     * Метод получения списка по имени
     * @param key
     * @return
     */
    public Item[] findByName(String key){
        Item[] result = new Item[this.position];
        for(int index = 0; index<items.length; index++) {
            if (items[index] != null || items[index].getId().equals(key)) {
                result[index] = items[index];
                break;
            }
        }
      return result;
    }
    /**
     * Метод получения заявки по id
     * @param id
     * @return
     */
    public Item findById(String id){
        Item result = null;
        for(Item item : items){
            if( item !=null && item.getId().equals(id)){
                result = item;
                break;
            }
        }
        return result;
    }
}
