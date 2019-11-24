package ru.job4j.sort;

import java.util.Comparator;

public class NameComparator implements Comparator<User> {
    @Override
    public int compare(User a, User b){
        return a.getName().length()-b.getName().length();
    }
}
