package ru.job4j.tracker;

 public class ShowItem extends BaseAction {

     protected ShowItem(int key, String name){
         super(key,name);
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
        return "====Show all Item====";
    }

}
