package ru.job4j.search;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *  Программа поиска в списке
 *  * Поиск мы должны осуществлять по всем полям через метод String.contains.
 *  * Например. Арсентьев, Петр, Брянск, 53742. Если мы ищем по слово "нкс" или 537 или Арс.
 *   Мы всегда должны вернуть этого пользователя
 */
public class PhoneDictionary {
    private List<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public List<Person> find(String key) throws IOException {
        List<Person> result = new ArrayList<>();
        for (Person person:persons){
            if (person.getAddress().contains(key)&&person.getName().contains(key)&&person.getPhone().contains(key)&&person.getSurname().contains(key)){
                return result;
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
