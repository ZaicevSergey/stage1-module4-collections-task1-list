package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aVal = Integer.parseInt(a);
        int bVal = Integer.parseInt(b);
        int aFunc = 5 * aVal * aVal + 3;
        int bFunc = 5 * bVal * bVal + 3;
        if (aFunc != bFunc) {
            return Integer.compare(aFunc, bFunc);
        } else {
            return Integer.compare(aVal, bVal);
        }
    }
}
