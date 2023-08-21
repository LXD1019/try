package test.CollectionTest.LinkedListTest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class deleteTest {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        System.out.println("原来的：");
        for (String a : list)
            System.out.print(a + " ");
        System.out.println();
        Iterator it = list.iterator();
        /*String aaa = (String) it.next();
        String bbb = (String) it.next();
        it.remove();
        String ccc = (String) it.next();
        it.remove();*/
        System.out.println(it.next());
        System.out.println(it.next());
        it.remove();
        System.out.println("更改后的：");
        for (String a : list)
            System.out.print(a + " ");


    }
}
