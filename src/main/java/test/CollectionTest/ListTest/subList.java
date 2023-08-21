package test.CollectionTest.ListTest;

import java.util.ArrayList;

public class subList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.forEach(i -> System.out.println(i + " : " + i));
        System.out.println();
        System.out.println("list.subList(3, 7) = " + list.subList(3, 7));

    }
}
