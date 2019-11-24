package ru.job4j.sort;

import java.util.*;

/**
метод , который будет возвращать TreeSet пользователей, отсортированных по возрасту в порядке возрастания.
 */
public class SortUser {
    public TreeSet<User> sort (List<User> userList){
        return new TreeSet<>(userList);
    }
    public List<User> sortNameLength (List<User> userList1){
        NameComparator nameComparator = new NameComparator();
        Collections.sort(userList1,nameComparator);
        return userList1;
    }

    public List<User> sortByAllFields (List<User> userList2){
        Comparator<User> cmp = new NameComparator().thenComparing(new AgeComparator());
        Collections.sort(userList2,cmp);
        return userList2;
    }
}
