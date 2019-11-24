package ru.job4j.sort;

import java.util.Comparator;

public class AgeComparator implements Comparator<User> {
    @Override
    public int compare(User a, User b){
        return a.getAge()-b.getAge();
    }
}
