package org.example.BEHAVIOR.ITERATOR;
import java.util.*;
public class IntIterator implements Iterator{
    private List<Integer> list;
    private int pos;

    public IntIterator(List<Integer> list){
        this.list = list;
        this.pos = 0;
    }

    @Override
    public boolean hasNext() {
        return pos < list.size();
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return list.get(pos++);
        }
        throw new NoSuchElementException("poka");
    }
}
