package ru.job4j.TrackerSingleton;

public class trackerSingle1 {
    private trackerSingle1(){
        System.out.println("trackerSingle1 test");
    }
    public static int getInt(){
        return 42;
    }
    private static class Holder{
        private static final trackerSingle1 TEST = new trackerSingle1();
    }
    public static trackerSingle1 getInstance(){
        return Holder.TEST;
    }

    public static void main(String[] args) {
        int a = trackerSingle1.getInt();
        System.out.println(a);
        trackerSingle1.getInstance();
    }
}
