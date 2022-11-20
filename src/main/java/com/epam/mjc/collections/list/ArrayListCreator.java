package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {

        List<String> arraylist = new ArrayList<String>();

        int position = 1; // index of Strings // I can do it :)
        for(String x:sourceList){
            if((position)%3 == 0){
                arraylist.add(x);
                arraylist.add(x);
            }
            position++;
        }
        return (ArrayList<String>) arraylist;
    }
}
