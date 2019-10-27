package ru.job4j.tracker;

public class FindAllAction extends BaseAction {

    protected FindAllAction(int key, String name){
        super(key,name);
    }


    @Override
    public String info() {
        return "Find all.";
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        for (Item item : tracker.findAll()) {
            System.out.println(String.format("%s %s", item.getId(), item.getName()));
        }
    }
}
