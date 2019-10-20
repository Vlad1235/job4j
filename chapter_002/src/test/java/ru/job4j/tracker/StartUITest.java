package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class StartUITest {

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        // создаём Tracker
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();
        //   создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll()[0].getName(), is("test name"));
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        // создаём Tracker
        Tracker tracker = new Tracker();
        //Напрямую добавляем заявку
        Item item = new Item("test name", "desc", 1234L);
        tracker.add(item);
        //создаём StubInput с последовательностью действий(производим замену заявки)
        String[] sequence = new String[]{"2", item.getId(), "заменили заявку", "test replace", "6"};
        StubInput input = new StubInput(sequence);
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }

    @Test
    public void deleteItemTest() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("wantDeleteItem", "desc", 1235L));
        Input input = new StubInput(new String[]{"3", item.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.delete(item.getId()), is(false));
        }

    @Test
    public void searchByIDItemTest() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("wantFind", "desc", 12356L));
        Input input = new StubInput(new String[]{"4", item.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is(item.getName()));
    }

    @Test
    public void whenPrtMenu() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        StubInput input = new StubInput(
                new String[] {"0"}
        );
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[] { action });
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu.")
                .add("0. Stub action")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }


}


