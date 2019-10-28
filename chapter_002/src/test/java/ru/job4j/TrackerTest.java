//package ru.job4j.tracker;
//
//import org.junit.Test;
//
//import static org.hamcrest.Matchers.is;
//import static org.junit.Assert.assertThat;
//
//public class TrackerTest {
//    @Test
//    public void addTest() {
//        Tracker tracker = new Tracker();
//        long created = System.currentTimeMillis();
//        Item item = new Item("test1", "testDescription", created);
//        tracker.add(item);
//        Item result = tracker.findById(item.getId());
//        assertThat(result.getName(), is(item.getName()));
//    }
//
//    @Test
//    public void replaceTest() {
//        Tracker tracker = new Tracker();
//        Item previous = new Item("test1", "testDescription", 123L);
//        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
//        tracker.add(previous);
//        // Создаем новую заявку.
//        Item next = new Item("test2", "testDescription2", 1234L);
//        // Проставляем старый id из previous, который был сгенерирован выше.
//        next.setId(previous.getId());
//        // Обновляем заявку в трекере.
//        tracker.replace(previous.getId(), next);
//        // Проверяем, что заявка с таким id имеет новые имя test2.
//        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
//    }
//    @Test
//    public void deleteTest() {
//        Tracker tracker = new Tracker();
//        Item item1 = new Item("test1", "testDescription1", 123L);
//        tracker.add(item1);
//        Item item2 = new Item("test2", "testDescription2", 1234L);
//        tracker.add(item2);
//        Item item3 = new Item("test3", "testDescription3", 12345L);
//        tracker.add(item3);
//        Item item4 = new Item("test4", "testDescription4", 123456L);
//        tracker.add(item4);
//        boolean result2 = true;
//        boolean result1 = tracker.delete(item1.getId());
//        assertThat(result2, is(result1));
//    }
//
//    @Test
//    public void findAllTest() {
//        Tracker tracker = new Tracker();
//        Item[] arr = new Item[3];
//        Item item1 = new Item("test1", "testDescription1", 123L);
//        tracker.add(item1);
//        Item item2 = new Item("test2", "testDescription2", 1234L);
//        tracker.add(item2);
//        Item item3 = new Item("test3", "testDescription3", 12345L);
//        tracker.add(item3);
//        Item[] result = tracker.findAll();
//        assertThat(arr.length, is(result.length));
//    }
//    @Test
//    public void findByNameTest() {
//        Tracker tracker = new Tracker();
//        Item item1 = new Item("test1", "testDescription1", 123L);
//        tracker.add(item1);
//        Item item2 = new Item("test2", "testDescription2", 1234L);
//        tracker.add(item2);
//        Item item3 = new Item("test3", "testDescription3", 12345L);
//        tracker.add(item3);
//        Item item4 = new Item("test2", "testDescription4", 123456L);
//        tracker.add(item4);
//        Item[] result = tracker.findByName("test2");
//        assertThat(result, is(tracker.findByName("test2")));
//    }
//
//    @Test
//    public void findByIdTest() {
//        Tracker tracker = new Tracker();
//        Item[] arr = new Item[4];
//        Item item1 = new Item("test1", "testDescription1", 123L);
//        tracker.add(item1);
//        Item item2 = new Item("test2", "testDescription2", 1234L);
//        tracker.add(item2);
//        Item item3 = new Item("test3", "testDescription3", 12345L);
//        tracker.add(item3);
//        Item item4 = new Item("test2", "testDescription4", 123456L);
//        tracker.add(item4);
//        Item result = tracker.findById(item1.getId());
//        assertThat(tracker.findById(item1.getId()), is(result));
//    }
//}