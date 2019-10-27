package ru.job4j.tracker;

/**
 * Чтобы протестировать старый вариант метода init нам нужно было проверить все случаи с if else.
 * Такой тест было бы сложно написать.
 * После удаления зависимостей от действий на такой класс StartUI написать тесты не составляет труда.
 * В нем вынесены все внешние зависимости за счет интерфейсов. Сам метод init состоит всего из 7 строк кода.
 * Давайте напишем на него тест.
 *
 * Мы будем использовать класс StubInput - для ввода знаний в наш тест. StubAction для загрузки действия и проверки, что мы выполнили этот тест.
 */
public class StubAction implements UserAction {
    private boolean call = false;

    @Override
    public String info() {
        return "Stub action";
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        call = true;
    }

    public boolean isCall() { //По этому полю мы будет проверять выбрал ли пользователь пункт меню или нет
        return call;
    }
}
