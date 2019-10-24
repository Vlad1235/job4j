package ru.job4j.tracker;


/**
 * Vladislav (fn1235@bk.ru)
 *
 * @version $Id$
 * @since 0.1
 */
public class StartUI {

    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";

    /**
     * Константа меню для вывода всех заявок.
     */
    private static final String SHOW = "1";

    /**
     * Константа меню для редактирования заявки.
     */
    private static final String EDIT = "2";

    /**
     * Константа меню для удаления заявки.
     */
    private static final String DELETE = "3";

    /**
     * Константа меню для поиска по ID.
     */
    private static final String FINDBYID = "4";

    /**
     * Константа меню для поиска по ID.
     */
    private static final String FINDBYNAME = "5";

    /**
     * Константа для выхода из цикла.
     */
    private static final String EXIT = "6";
    /**
     * Получение данных от пользователя.
     */
    private final Input input;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основой цикл программы.
     */
        public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }


    /**
     * Метод реализует добавленя новой заявки в хранилище.
     */
        public static void createItem(Input input, Tracker tracker) {
            System.out.println("=== Create a new Item ====");
            System.out.print("Enter name: ");
            String name = input.ask("");
            Item item = new Item(name);
            tracker.add(item);
        }


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

    /**
     * Метод реализует поиск заявки по имени.
     */
    private void searchItem() {
        System.out.println("------------ Поиск заявки --------------");
        String nameOld = this.input.ask("Введите имя заявки :");
        Item[] itemsFound = tracker.findByName(nameOld);
        for (int index = 0; index < itemsFound.length; index++) {
            System.out.println("------------ Заявка : " + itemsFound[index].getName() + "-----найдена.-----");
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    /**
     * Запуск программы.
     * @param args
     */
        public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction()
        };
        new StartUI().init(input, tracker, actions);
    }

}
