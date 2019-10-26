package ru.job4j.tracker;
/**
 * у нас есть  методы, который полностью одинаковые. Мы можем их вынеси в абстрактный класс
 *
 * Методы из интерфейса UserAction, которые мы не реализуем в абстрактном классе BaseAction,
 * ненужно помечать как абстрактные в BaseAction, они автоматически переходят по цепочке наследования до класса реализующего непосредственное события,
 * например добавление элемента.
 *
 * Как мы видим, класс BaseAction частично реализует методы интерфейса UserAction.
 * Теперь мы можем использовать этот класс для реализации действий.
 * Например, мы можем переписать класс AddAction
 */
public class BaseAction implements UserAction {
    private final int key;
    private final String name;

    protected BaseAction(final int key, final String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public int key() {
        return this.key;
    }

    @Override
    public String info() {
        return String.format("%s : %s", this.key, this.name);
    }

}
