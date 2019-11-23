package ru.job4j.sort;

import org.junit.Test;

import java.net.UnknownServiceException;
import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortUserTest {
    @Test
    public void sortUserTest(){
        SortUser sortUser = new SortUser();
        User user1 = new User("Slava",25);
        User user2 = new User("Oleg",30);
        User user3 = new User("Vladimir",35);
        User user4 = new User("Sergey",20);
        List<User> userList = new ArrayList<>(Arrays.asList(user1,user2,user3,user4));
        TreeSet<User> result = sortUser.sort(userList);
         assertThat(userList,is(result));
    }
}
