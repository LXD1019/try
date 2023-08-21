package test.CollectionTest.ListTest;

import java.util.ArrayList;
import java.util.Collections;

public class shuffleTest {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add(i);
        }
        list.forEach(i -> System.out.print(i+" "));
        System.out.println();
        Collections.shuffle(list);
        System.out.println("打乱排序之后：");
        list.forEach(i -> System.out.print(i+" "));
    }

}
