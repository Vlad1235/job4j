package ru.job4j.tracker;
    /**
     * Метод реализует удаление заявки, которую укажет пользователь.
     */
public class DeleteAction extends BaseAction {

    protected DeleteAction(int key, String name){
        super(key,name);
    }
    @Override
    public String info() {
        return "=== Delete Item ====";
    }

    @Override
    public boolean execute(Input input,Tracker tracker) {
        System.out.println("------------ Удаление заявки --------------");
        String idOld = input.ask("Введите ID заявки :");
        boolean result = tracker.delete(idOld);
        if (result) {
            System.out.println("------------ Заявка : " + idOld + "--успешно удалена.-----");
        } else {
            System.out.println("------------ Проверить корректность ID заявки -----");
        }
        return result;
    }
}
