package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

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
    public List<Person> find(String key) {
        List<Person> result = new ArrayList<Person>();
        for (int in = 0; in < persons.size();in++) {
            if (persons.get(in).getSurname().contains(key)||
                    persons.get(in).getPhone().contains(key)||
                    persons.get(in).getName().contains(key)||
                    persons.get(in).getAddress().contains(key)) {
                 result.add(persons.get(in));
            } else {
                result.isEmpty();
            }
        }
        return result;
    }
}
