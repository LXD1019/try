package test.streamTest.test;

import test.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class stream {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();

        userList.add(new User("1","李大锤","23","南京"));
        userList.add(new User("2","张无忌","18","西安"));
        userList.add(new User("3","刘德华","26","苏州"));
        userList.add(new User("4","郭靖","33","上海"));

        String a = userList.stream().map(User::getName).collect(Collectors.joining(","));
        System.out.println(a);
        List<User> userList1 = new ArrayList<>();
        String[] data = a.split(",");
        for (int i = 0; i < userList.size(); i++) {
            userList1.add(new User("1",data[i],"23","南京"));
        }
        for (User x : userList1) {
            System.out.println(x);
        }

    }

}
