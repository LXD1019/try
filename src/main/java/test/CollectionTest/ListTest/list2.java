package test.CollectionTest.ListTest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
class User1{

    private String id;
    private String name;
    private String age;
    private String address;

}

public class list2 {

    public static void main(String[] args) {

        List<User1> userList = new ArrayList<>();

        userList.add(new User1("3","李大锤","23","南京"));
        userList.add(new User1("6","张无忌","18","西安"));
        userList.add(new User1("1","刘德华","26","苏州"));
        userList.add(new User1("9","郭靖","33","上海"));

        userList.add(new User1("1","李大锤","23","南京"));    //id相同，其他数据也相同
        userList.add(new User1("3","带头大哥","36","杭州"));  //id相同，其他数据不同

        for (User1 u : userList) {
            System.out.println("去重前 --> " + u);
        }

        //根据userid去重,返回的结果会自动根据userid正序排序
        userList = userList.stream().collect(
                Collectors.collectingAndThen(
                        Collectors.toCollection(
                                () -> new TreeSet<>(
                                        Comparator.comparing(User1 :: getId))), ArrayList::new)
        );
        //System.out.println(userList);

        System.out.println();

        for (User1 u : userList) {
            System.out.println("去重后 --> " + u);
        }

        //根据age倒序排序
        userList = userList.stream().sorted(
                Comparator.comparing(User1::getAge)
                        .reversed()).collect(Collectors.toList());

        System.out.println();
        for (User1 u : userList) {
            System.out.println("排序后 --> " + u);
        }

    }

}
