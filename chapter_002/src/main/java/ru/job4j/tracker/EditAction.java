package ru.job4j.tracker;

public class EditAction extends BaseAction {
    Input input;
    Tracker tracker;

    /**
     * Метод реализует редактирование заявки, ID которой укажет пользователь.
     */
    private void editItem() {
        System.out.println("------------ Редактирование заявки --------------");
        String idOld = this.input.ask("Введите ID заявки :");
        String description = this.input.ask("Введите описание: ");
        String nameEdited = this.input.ask("Введите новое имя заявки :");
        Item next = new Item(nameEdited, description, System.currentTimeMillis());
        next.setId(idOld);
        if (tracker.replace(next.getId(), next)) {
            System.out.println("------------ Заявка обновлена. --------------");
            System.out.println("------------ Новое имя заявки : " + next.getName() + "-----------");
        } else {
            System.out.println("------------ Заявка не найдена. --------------");
        }
    }
}
