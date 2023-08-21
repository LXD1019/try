package test.CollectionTest.LinkedListTest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest2 {

    public static void main(String[] args) {

        LinkedList<String> a = new LinkedList<>();
        a.add("aaa");
        a.add("bbb");
        a.add("ccc");

        LinkedList<String> b = new LinkedList<>();
        b.add("111");
        b.add("222");
        b.add("333");
        b.add("444");

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();
        while (bIter.hasNext()) {
            if (aIter.hasNext())
                aIter.next();
            aIter.add(bIter.next());
        }
        System.out.println("a -> " + a);

        bIter = b.iterator();
        while (bIter.hasNext()) {
            bIter.next();
            if (bIter.hasNext()) {
                bIter.next();
                bIter.remove();
            }
        }
        System.out.println("b -> " + b);

        a.removeAll(b);

        System.out.println("a -> " + a);

    }

}
