package ru.job4j.tracker;

public class CreateAction extends BaseAction {
    @Override
    public String name() {
        return "=== Create a new Item ====";
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.print("Enter name: ");
        String name = input.ask("");
        Item item = new Item(name);
        tracker.add(item);
    }
}
