package ru.job4j.tracker;

/**
 * мы избавились от кода, который дублировался
 */
public class AddItem extends BaseAction {

    public AddItem(int key, String name) {

        super(key, name);
    }

    @Override
    public int key() {
        return 0;
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.ask("Enter name:");
        String desc = input.ask("Enter description:");
        tracker.add(new Item(name, desc));
        return true;
    }

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "add new item.");
    }

}