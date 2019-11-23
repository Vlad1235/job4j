package ru.job4j;

import org.junit.Test;
import ru.job4j.map.User;
import ru.job4j.map.UserConvert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserConvertTest {
    @Test
    public void testUserConvert(){
        UserConvert userConvert = new UserConvert();
        User user1 = new User(12,"Ivan", "Saint Petersburg");
        User user2 = new User(13,"Maria", "Moscow");
        User user3 = new User(14,"Darya", "Volgograd");
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        HashMap<Integer, User> testing =new HashMap<>();
        testing.put(12,user1);
        testing.put(13,user2);
        testing.put(14,user3);
        HashMap<Integer,User> result = userConvert.process(userList);
        assertThat(testing,is(result));
    }
}