package ru.job4j.sort;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortUserTestComparator {
    @Test
    public void sortUserTest2(){
        SortUser sortUser = new SortUser();
        User user1 = new User("Sergey",25);
        User user2 = new User("Ivan",30);
        User user3 = new User("Sergey",20);
        User user4 = new User("Ivan",25);
        List<User> userList = new ArrayList<User>(Arrays.asList(user1,user2,user3,user4));
        List<User> expecting = new ArrayList<>(Arrays.asList(user2,user4,user1,user3));
        List<User> result = sortUser.sortNameLength(userList);
        assertThat(expecting,is(result));
    }
    @Test
    public void sortUserTest3(){
        SortUser sortUser = new SortUser();
        User user1 = new User("Sergey",25);
        User user2 = new User("Ivan",30);
        User user3 = new User("Sergey",20);
        User user4 = new User("Ivan",25);
        List<User> userList = new ArrayList<User>(Arrays.asList(user1,user2,user3,user4));
        List<User> expecting = new ArrayList<>(Arrays.asList(user4,user2,user3,user1));
        List<User> result = sortUser.sortByAllFields(userList);
        assertThat(expecting,is(result));
    }

}
