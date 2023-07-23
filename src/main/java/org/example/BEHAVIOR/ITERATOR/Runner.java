package org.example.BEHAVIOR.ITERATOR;

public class Runner {
    public static void main(String[] args) {

        IntList ilist = new IntList();

        ilist.add(1);
        ilist.add(2);
        ilist.add(3);


        Iterator it = ilist.getIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
