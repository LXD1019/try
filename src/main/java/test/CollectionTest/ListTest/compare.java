package test.CollectionTest.ListTest;

import java.util.ArrayList;
import java.util.List;

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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

public class compare {

    public static void main(String[] args) {

        Student s1 = new Student("张三", 6);
        Student s2 = new Student("李四", 6);
        Student s3 = new Student("王五", 6);

        List<Student> l1 = new ArrayList<Student>();
        List<Student> l2 = new ArrayList<Student>();

        l1.add(s1);
        l1.add(s2);

        l2.add(s1);
        l2.add(s3);

        for (int i = 0; i < l1.size(); i++) {
            if (l1.get(i).getName().equals(l2.get(i).getName())) {
                System.out.println("update " + i);
            } else {
                System.out.println("add " + i);
            }
        }

    }

}
