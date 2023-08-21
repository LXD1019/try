package test.basic;

import java.util.Arrays;
import java.util.List;

public class shuzuToList {
    public static void main(String[] args) {

        //数组转为集合
        String[] values = {"1","2","3","4","5"};
        for (String s : values) {
            System.out.println(s);
        }
        List<String> list = Arrays.asList(values);
        for (String s : list) {
            System.out.println(s);
        }

        //集合转为数组
        String[] change = list.toArray(new String[list.size()]);
        for (String s : change) {
            System.out.println(s);
        }

    }
}
