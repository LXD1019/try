package test.CollectionTest.HashMapTest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Employee {

    private String id;
    private String name;

}

public class Test04 {
    public static void main(String[] args) {

        HashMap<String, Employee> map = new HashMap<String, Employee>();
        map.put("111",new Employee("111","张三"));
        map.put("222",new Employee("222","李四"));
        map.put("333",new Employee("333","王五"));

        System.out.println("初始：");
        map.forEach(
                (k,v) -> System.out.println(k + " -> " + v)
        );

        Set<String> set = new HashSet<>();
        set.add("111");

        map.keySet().removeAll(set);

        System.out.println("修改后：");
        map.forEach(
                (k,v) -> System.out.println(k + " -> " + v)
        );
        
        map.clear();
        System.out.println("clear之后：");
        System.out.println(map);

    }
}
