package test.streamTest.Java8_pdf;

import test.entity.Dish;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class 测验 {

    public static void main(String[] args) {

        List<Dish> menu = new ArrayList<>();
        menu.add(new Dish("beef-1", false, 100, Dish.Type.MEAT));
        menu.add(new Dish("pork-2", false, 200, Dish.Type.MEAT));
        menu.add(new Dish("ham-3", true, 300, Dish.Type.MEAT));
        menu.add(new Dish("greaves-4", true, 400, Dish.Type.FISH));
        menu.add(new Dish("flitch-5", false, 500, Dish.Type.OTHER));

        /**
         * 测验5.3：归约
         * 怎样用map和reduce方法数一数流中有多少个菜呢？
         */
        //question5_3(menu);
        /**
         * 测验5.4：斐波纳契元组序列
         * 斐波纳契数列是著名的经典编程练习。
         * 下面这个数列就是斐波纳契数列的一部分：0, 1, 1,2, 3, 5, 8, 13, 21, 34, 55…
         * 数列中开始的两个数字是0和1，后续的每个数字都是前两个数字之和。
         * 斐波纳契元组序列与此类似，是数列中数字和其后续数字组成的元组构成的序列：
         * (0, 1),(1, 1), (1, 2), (2, 3), (3, 5), (5, 8), (8, 13), (13, 21) …
         */
        question5_4();


    }

    public static void question5_3(List<Dish> menu) {
        int sum = menu.stream()
                .map(d -> 1)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }

    public static void question5_4() {

        Stream.iterate(new int[]{0,1}, a -> new int[]{a[1],a[0]+a[1]})
                .limit(5)
                .forEach(a -> System.out.println("(" + a[0] + "," + a[1] + ")"));

        Stream.iterate(new int[]{0,1}, a -> new int[]{a[1],a[0]+a[1]})
                .limit(20)
                .map(a -> a[0])
                .forEach(a -> System.out.print(a + ","));

    }

}
