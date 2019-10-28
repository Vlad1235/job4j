package ru.job4j;
/**
 * В тестах нужно проверить "синглетность", то что при нескольких созданиях нового Traker,
 * будет возвращаться один и тот же объект
 */

import org.junit.Test;
import ru.job4j.TrackerSingleton.trackerSingle1;
import ru.job4j.TrackerSingleton.trackerSingle2;
import ru.job4j.TrackerSingleton.trackerSingle3;
import ru.job4j.TrackerSingleton.trackerSingle4;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TrackerSingletonTest {

    @Test
    public void setTrackerSingle1Test(){
        trackerSingle1 trackerSingle1 = ru.job4j.TrackerSingleton.trackerSingle1.getInstance();
        trackerSingle1 trackerSingle11 = ru.job4j.TrackerSingleton.trackerSingle1.getInstance();
        assertThat(trackerSingle1,is(trackerSingle11));
    }

    @Test
    public void setTrackerSingle2Test(){
        trackerSingle2 trackerSingle2 = ru.job4j.TrackerSingleton.trackerSingle2.INSTANCE;
        trackerSingle2 trackerSingle21 = ru.job4j.TrackerSingleton.trackerSingle2.INSTANCE;
        assertThat(trackerSingle2,is(trackerSingle21));
    }

    @Test
    public void setTrackerSingle3Test(){
        trackerSingle3 trackerSingle3 = ru.job4j.TrackerSingleton.trackerSingle3.getInstance();
        trackerSingle3 trackerSingle31 = ru.job4j.TrackerSingleton.trackerSingle3.getInstance();
        assertThat(trackerSingle3,is(trackerSingle31));
    }

    @Test
    public void setTrackerSingle4Test(){
        trackerSingle4 trackerSingle4 = ru.job4j.TrackerSingleton.trackerSingle4.getInstance();
        trackerSingle4 trackerSingle41 = ru.job4j.TrackerSingleton.trackerSingle4.getInstance();
        assertThat(trackerSingle4,is(trackerSingle41));
    }

}
