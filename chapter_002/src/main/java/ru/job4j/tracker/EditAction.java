package ru.job4j.tracker;

    /**
     * Метод реализует редактирование заявки, ID которой укажет пользователь.
     */
public class EditAction extends BaseAction {

    protected EditAction(int key, String name){
        super(key,name);
    }

    @Override
    public String info() {
        return "==== Edit Item ====";
    }

    public boolean execute(Input input, Tracker tracker) {
        System.out.println("------------ Редактирование заявки --------------");
        String idOld = input.ask("Введите ID заявки :");
        String description = input.ask("Введите описание: ");
        String nameEdited = input.ask("Введите новое имя заявки :");
        Item next = new Item(nameEdited, description);
        next.setId(idOld);
        if (tracker.replace(next.getId(), next)) {
            System.out.println("------------ Заявка обновлена. --------------");
            System.out.println("------------ Новое имя заявки : " + next.getName() + "-----------");
        } else {
            System.out.println("------------ Заявка не найдена. --------------");
        }
        return true;
    }
}
