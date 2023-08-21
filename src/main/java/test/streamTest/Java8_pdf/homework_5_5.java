package test.streamTest.Java8_pdf;

import test.entity.Trader;
import test.entity.Transaction;

import java.util.*;
import java.util.stream.Collectors;

public class homework_5_5 {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        //(1) 找出2011年发生的所有交易，并按交易额排序（从低到高）。
        //q1(transactions);
        //(2) 交易员都在哪些不同的城市工作过？
        //q2(transactions);
        //(3) 查找所有来自于剑桥的交易员，并按姓名排序。
        //q3(transactions);
        //(4) 返回所有交易员的姓名字符串，按字母顺序排序。
        //q4(transactions);
        //(5) 有没有交易员是在米兰工作的？
        //q5(transactions);
        //(6) 打印生活在剑桥的交易员的所有交易额。
        //q6(transactions);
        //(7) 所有交易中，最高的交易额是多少？
        //q7(transactions);
        //(8) 找到交易额最小的交易。
        q8(transactions);

    }

    public static void q1(List<Transaction> transactions) {
        List<Transaction> list = transactions.stream()
                .filter(d -> d.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getYear))
                .collect(Collectors.toList());
        for (Transaction a : list)
            System.out.println(a);
    }

    public static void q2(List<Transaction> transactions) {
        //1.
        List<String> list1 = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());
        //2.
        List<String> list2 = transactions.stream()
                .map(d -> d.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        //3.
        Set<String> list3 = transactions.stream()
                .map(d -> d.getTrader().getCity())
                .collect(Collectors.toSet());

        for (String a : list1)
            System.out.println(a);
    }

    public static void q3(List<Transaction> transactions) {
        List<Trader> list = transactions.stream()
                .map(Transaction::getTrader)
                .filter(d -> d.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        for (Trader a : list)
            System.out.println(a);
    }

    public static void q4(List<Transaction> transactions) {
        //1.
        String s1 = transactions.stream()
                .map(d -> d.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (a,b) -> a+b);
        //2.
        String s2 = transactions.stream()
                .map(d -> d.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining());
        System.out.println(s2);
    }

    public static void q5(List<Transaction> transactions) {
        //1.
        boolean a = transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .anyMatch(d -> d.getCity().equals("Milan"));
        //2.
        boolean b = transactions.stream()
                .anyMatch(d -> d.getTrader().getCity().equals("Milan"));
        if (a)
            System.out.println("有交易员是在米兰工作的");
        else
            System.out.println("没有交易员是在米兰工作的");
    }

    public static void q6(List<Transaction> transactions) {
        transactions.stream()
                .filter(d -> d.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);
    }

    public static void q7(List<Transaction> transactions) {
        Optional<Integer> max = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println(max.get());
    }

    public static void q8(List<Transaction> transactions) {
        //1.
        Optional<Transaction> min1 = transactions.stream()
                .reduce((a, b) -> a.getValue() < b.getValue() ? a : b);
        //2.
        Optional<Transaction> min2 = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue));
        System.out.println(min2.get());
    }

}
