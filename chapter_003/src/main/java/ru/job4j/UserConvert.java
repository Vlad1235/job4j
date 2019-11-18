package ru.job4j;

import java.util.HashMap;
import java.util.List;


public class UserConvert {
        HashMap<Integer, User> myMap;
    public HashMap<Integer, User> process(List<User> list) {
            for (User obj: list){
                myMap.put(obj.getId(),obj);
            }
            return myMap;
    }
}
