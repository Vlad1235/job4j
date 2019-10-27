package ru.job4j.tracker;

public class CreateAction extends BaseAction {

    protected CreateAction(int key, String name){
        super(key,name);
    }

    @Override
    public String info() {
        return "=== Create a new Item ====";
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.print("Enter name: ");
        String name = input.ask("Enter name: ");
        String decs = input.ask("Enter desc: ");
        Item item = new Item(name,decs);
        tracker.add(item);
    }
}
