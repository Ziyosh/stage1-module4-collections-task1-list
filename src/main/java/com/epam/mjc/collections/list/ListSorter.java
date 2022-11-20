package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int i = Math.abs(Integer.parseInt(a)) - Math.abs(Integer.parseInt(b));
        return i==0&&a.startsWith("-")?-1:(i==0&&b.startsWith("-"))?1:i;
    }
}