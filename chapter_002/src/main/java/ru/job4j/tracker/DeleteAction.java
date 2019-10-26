package ru.job4j.tracker;

public class DeleteAction extends BaseAction {
    Input input;
    Tracker tracker;
    /**
     * Метод реализует удаление заявки, которую укажет пользователь.
     */
    private void deleteItem() {
        System.out.println("------------ Удаление заявки --------------");
        String idOld = this.input.ask("Введите ID заявки :");
        boolean result = tracker.delete(idOld);
        if (result) {
            System.out.println("------------ Заявка : " + idOld + "--успешно удалена.-----");
        } else {
            System.out.println("------------ Проверить корректность ID заявки -----");
        }
    }
}
