package org.example.BEHAVIOR.ITERATOR;
import java.util.*;
public class IntList {
    private List<Integer> list;
    public IntList() {
        list = new ArrayList<>();
    }
    public void add(int i) {
        list.add(i);
    }
    public Iterator getIterator() {
        return new IntIterator(list);
    }
}
