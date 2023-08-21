package test.CollectionTest.ListTest;

import java.util.ArrayList;
import java.util.Collections;

public class sortTest {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(7);
        list.add(0);
        list.forEach(i -> System.out.print(i+" "));
        System.out.println();
        Collections.sort(list);
        System.out.println("打乱排序之后：");
        list.forEach(i -> System.out.print(i+" "));


    }
}
