package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        for(int x:sourceList){
            if(x%2 == 0){
                linkedList.add(x);
            }else{
                linkedList.addFirst(x);
            }
        }
        return linkedList;
    }
}
