package test.CollectionTest.HashMapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test02 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("Java入门教程", "http://c.biancheng.net/java/");
        map.put("C语言入门教程", "http://c.biancheng.net/c/");

        //lambda
        map.forEach(
                (k,v) -> System.out.println("key = " + k + ", value = " + v)
        );

        //四种遍历
        //No.1
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String mapKey = entry.getKey();
            String mapValue = entry.getValue();
            System.out.println(mapKey + "：" + mapValue);
        }

        //No.2
        // 打印键集合
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        // 打印值集合
        for (String value : map.values()) {
            System.out.println(value);
        }

        //No.3
        Iterator<Map.Entry<String, String>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, String> entry = entries.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }

        //No.4
        for(String key : map.keySet()){
            String value = map.get(key);
            System.out.println(key+":"+value);
        }

    }
}
