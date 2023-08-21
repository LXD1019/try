package test.CollectionTest.LinkedListTest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class addTest {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        System.out.println("原来的：");
        for (String a : list)
            System.out.print(a + " ");
        System.out.println();
        ListIterator<String> it = list.listIterator();
        it.next();
        it.add("666");
        System.out.println("更改后的：");
        for (String a : list)
            System.out.print(a + " ");
    }
}
