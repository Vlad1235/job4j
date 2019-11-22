package ru.job4j;

import java.util.HashMap;
import java.util.List;


public class UserConvert {
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> myMap = new HashMap<Integer, User>();
            for (User obj: list){
                myMap.put(obj.getId(),obj);
            }
            return myMap;
    }
}
