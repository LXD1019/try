package test.CollectionTest.HashMapTest;

import java.util.HashMap;

public class Test03 {

    public static void main(String[] args) {

        HashMap<Object, Object> map = new HashMap<>();
        map.put("111","aaa");
        map.put("222","bbb");
        map.put("333","ccc");

        System.out.println(map);

        map.remove("222");

        map.put("333","ddd");

        map.forEach(
                (k,v) -> System.out.println("key = " + k + ", value = " + v)
        );

    }

}
