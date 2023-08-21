package test.CollectionTest.ListTest;

import java.util.ArrayList;
import java.util.Collections;

public class binarySearch {
    public static void main(String[] args) {

        //要查找某个元素，必须提供集合，而且这个集合必须实现List接口
        //集合必须有序，如果没有序，应该先排序再二分查找
        //如果要查找的元素的类型没有实现Comparable接口的compareTo方法进行排序，就还要提供一个比较器。（此处说明的是二分查找的2种方式）

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        list.forEach(i -> System.out.println("第" + (i-1) + "个元素是：" + list.get(i-1)));
        Integer a = Collections.binarySearch(list,5);
        System.out.println("a = " + a);
        System.out.println("list(a) = " + list.get(a));

    }
}
