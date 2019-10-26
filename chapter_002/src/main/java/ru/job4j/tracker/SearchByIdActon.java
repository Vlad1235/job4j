package ru.job4j.tracker;

public class SearchByIdActon extends BaseAction {
    Input input;
    Tracker tracker;
    /**
     * Метод реализует поиск заявки по ID, который укажет пользователь.
     */
    private void searchByIDItem() {
        System.out.println("------------ Поиск заявки --------------");
        String nameOld = this.input.ask("Введите ID заявки :");
        Item item = tracker.findById(nameOld);
        if (item != null) {
            System.out.println("------------ Заявка : " + item.getName() + "-----найдена.-----");
        } else {
            System.out.println("------------ Заявка не найдена.-----");
        }
    }
}
