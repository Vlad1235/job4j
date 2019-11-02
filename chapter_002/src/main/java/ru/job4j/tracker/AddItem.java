package ru.job4j.tracker;

/**
 * мы избавились от кода, который дублировался
 */
public class AddItem extends BaseAction {

    public AddItem(int key, String name) {
        super(key, name);
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.ask("Enter name:");
        String decs = input.ask("Enter description:");
        tracker.add(new Item(name, decs));
        return true;
    }
}
