package ru.job4j.sort;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
метод , который будет возвращать TreeSet пользователей, отсортированных по возрасту в порядке возрастания.
 */
public class SortUser {
    public TreeSet<User> sort (List<User> userList){
        TreeSet<User> users = new TreeSet<>();
            for (User user: userList ){
                users.add(user);
            }
        return users;
    }
}
