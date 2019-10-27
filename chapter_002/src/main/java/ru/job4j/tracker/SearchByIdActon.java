package ru.job4j.tracker;

    /**
     * Метод реализует поиск заявки по ID, который укажет пользователь.
     */
public class SearchByIdActon extends BaseAction {

    protected SearchByIdActon(int key, String name){
        super(key,name);
    }

    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Поиск заявки --------------");
        String nameOld = input.ask("Введите ID заявки :");
        Item item = tracker.findById(nameOld);
        if (item != null) {
            System.out.println("------------ Заявка : " + item.getName() + "-----найдена.-----");
        } else {
            System.out.println("------------ Заявка не найдена.-----");
        }
    }
}
