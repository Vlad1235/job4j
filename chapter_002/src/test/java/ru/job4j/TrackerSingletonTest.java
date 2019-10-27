package ru.job4j;
/**
 * В тестах нужно проверить "синглетность", то что при нескольких созданиях нового Traker,
 * будет возвращаться один и тот же объект
 */

import org.junit.Test;
import ru.job4j.TrackerSingleton.trackerSingle1;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TrackerSingletonTest {

    @Test
    public void setTrackerSingle1Test(){
        trackerSingle1 trackerSingle1 = ru.job4j.TrackerSingleton.trackerSingle1.getInstance();
        assertThat();
    }


}
