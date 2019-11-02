package ru.job4j.tracker;

public class ExitProgram extends BaseAction {

    protected ExitProgram(int key, String name){
        super(key,name);
    }
    @Override
    public String info() {
        return "=== Exit Program ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
