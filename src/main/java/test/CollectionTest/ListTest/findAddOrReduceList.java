package test.CollectionTest.ListTest;

import java.util.ArrayList;
import java.util.List;

class User{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class findAddOrReduceList {

    public static void main(String[] args) {

        List<User> users1 = new ArrayList<User>(); //张三 李四
        List<User> users2 = new ArrayList<User>(); //张三 李四 王五
        List<User> users3 = new ArrayList<User>(); //李四 王五
        List<User> users4 = new ArrayList<User>(); //李四 王五 赵六


        User a = new User("张三", 6);
        User b = new User("李四", 7);
        User c = new User("王五", 8);
        User d = new User("赵六", 9);


        users1.add(a);
        //users1.add(b);

        //users2.add(a);
        //users2.add(b);
        users2.add(c);

        users3.add(b);
        users3.add(c);

        users4.add(b);
        users4.add(c);
        users4.add(d);

        System.out.println(getAddaListThanbList(users2, users1));
        System.out.println(getReduceaListThanbList(users2, users1));

        //System.out.println(getAddaListThanbList(users1, users3).toString());
        //System.out.println(getReduceaListThanbList(users1, users3).toString());

        ////4比2多什么
        //System.out.println(getAddaListThanbList(users4, users2).toString());
        ////4比2少什么
        //System.out.println(getReduceaListThanbList(users4, users2).toString());

    }

    public static <E> List<E> getAddaListThanbList(List<E> aList, List<E> bList) {
        List<E> addList = new ArrayList<E>();
        for (int i = 0; i < aList.size(); i++) {
            if (!myListContains(bList, aList.get(i))) {
                addList.add(aList.get(i));
            }
        }
        return addList;
    }

    public static <E> List<E> getReduceaListThanbList(List<E> aList, List<E> bList) {
        List<E> reduceaList = new ArrayList<E>();
        for (int i = 0; i < bList.size(); i++) {
            if (!myListContains(aList, bList.get(i))) {
                reduceaList.add(bList.get(i));
            }
        }
        return reduceaList;
    }

    private static <E> boolean myListContains(List<E> sourceList, E element) {
        if (sourceList == null || element == null) {
            return false;
        }
        if (sourceList.isEmpty()) {
            return false;
        }
        for (E tip : sourceList) {
            if (element.equals(tip)) {
                return true;
            }
        }
        return false;
    }

}
