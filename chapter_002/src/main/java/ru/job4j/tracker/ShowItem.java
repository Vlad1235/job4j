package ru.job4j.tracker;

public static class ShowItem implements UserAction {
    @Override
    public int key() {
        return 1;
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        for (Item item : tracker.findAll()) {
            System.out.println(String.format("Name: %s| Desc: %s| Id: %s",
                    item.getName(), item.getDecs(), item.getId()));
        }
        return true;
    }

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "show all item.");
    }

}
