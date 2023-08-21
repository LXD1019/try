package test.CollectionTest.ListTest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
class AAA {
    private String name;
    private int age;
}

public class list {

    public static void main(String[] args) {

        AAA s1 = new AAA("张三", 1);
        AAA s2 = new AAA("李四", 2);
        AAA s3 = new AAA("王五", 3);

        List<AAA> l1 = new ArrayList<>();
        List<AAA> l2 = new ArrayList<>();

        l1.add(s1);
        l1.add(s2);
        l1.add(s3);


        // 1.
        /*l1.stream().findFirst().map(vo -> {
            if (vo.getAge()!=6){
                l1.remove(vo);
            }
            System.out.println("vo --> "+vo);
            return vo;
        });
        System.out.println("l1 --> "+l1);*/

        // 2.
        l1.removeIf(a -> a.getAge() == 1 || a.getName().equals("李四"));
        System.out.println("l1 --> "+l1);

        if (l2.isEmpty()) {
            System.out.println("l2.isEmpty()");
        }

        if (l2 != null) {
            System.out.println("null");
        }


    }

}
