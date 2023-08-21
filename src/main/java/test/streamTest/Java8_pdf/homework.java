package test.streamTest.Java8_pdf;

import test.CollectionTest.ListTest.list2;
import test.entity.Dish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class homework {

    public static void main(String[] args) {

        List<Dish> menu = new ArrayList<>();
        menu.add(new Dish("beef-1", false, 100, Dish.Type.MEAT));
        menu.add(new Dish("pork-2", false, 200, Dish.Type.MEAT));
        menu.add(new Dish("ham-3", true, 300, Dish.Type.MEAT));
        menu.add(new Dish("greaves-4", true, 400, Dish.Type.FISH));
        menu.add(new Dish("flitch-5", false, 500, Dish.Type.OTHER));

        /**
         * 给定一个数字列表，如何返回一个由每个数的平方构成的列表呢？
         * 例如，给定[1, 2, 3, 4, 5]，应该返回[1, 4, 9, 16, 25]。
         */
        //question1();
        /**
         * 给定两个数字列表，如何返回所有的数对呢？
         * 例如，给定列表[1, 2, 3]和列表[3, 4]，应该返回[(1, 3), (1, 4), (2, 3), (2, 4), (3, 3), (3, 4)]。
         */
        //question2();
        /**
         * 如何扩展前一个例子，只返回总和能被3整除的数对呢？
         * 例如(2, 4)和(3, 3)是可以的。
         */
        //question3();

    }

    public static void question1() {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> list1 = list.stream()
                .map(d -> d*d)
                .collect(Collectors.toList());
        System.out.println(list1);
    }

    public static void question2() {
        List<Integer> list = Arrays.asList(1,2,3);
        List<Integer> list1 = Arrays.asList(3,4);
        List<int[]> list2 = list.stream()
                .flatMap(
                        d -> list1.stream().map(a -> new int[]{d,a})
                )
                .collect(Collectors.toList());
        for (int i = 0; i < list2.size(); i++) {
            for (int j = 0; j < list2.get(i).length; j++) {
                System.out.print(list2.get(i)[j] + " ");
            }
            System.out.println();
        }

    }

    public static void question3() {
        List<Integer> list = Arrays.asList(1,2,3);
        List<Integer> list1 = Arrays.asList(3,4);
        List<int[]> list2 = list.stream().flatMap(
                a -> list1.stream().filter(
                        b -> (a+b) % 3 == 0
                ).map(c -> new int[]{a,c})
        ).collect(Collectors.toList());
        for (int i = 0; i < list2.size(); i++) {
            for (int j = 0; j < list2.get(i).length; j++) {
                System.out.print(list2.get(i)[j] + " ");
            }
            System.out.println();
        }
    }

}
