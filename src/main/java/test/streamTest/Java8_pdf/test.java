package test.streamTest.Java8_pdf;

import test.entity.Dish;
import test.entity.Trader;
import test.entity.Transaction;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class test {

    public static void main(String[] args) {

        List<Dish> menu = new ArrayList<>();
        menu.add(new Dish("beef-1", false, 100, Dish.Type.MEAT));
        menu.add(new Dish("pork-2", false, 200, Dish.Type.MEAT));
        menu.add(new Dish("ham-3", true, 300, Dish.Type.MEAT));
        menu.add(new Dish("greaves-4", true, 400, Dish.Type.FISH));
        menu.add(new Dish("flitch-5", false, 500, Dish.Type.OTHER));

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

        //sorted(menu);
        //limit(menu);
        //sout(menu);
        //booleanTest(menu);
        //distinct(menu);
        //skip(menu);
        //getLength(menu);
        //flatmap(menu);
        //anyMatch(menu);
        //allMatch(menu);
        //noneMatch(menu);
        /**
         * Optional
         * Optional<T>类（java.util.Optional）是一个容器类，代表一个值存在或不存在。
         * 在上面的代码中，findAny可能什么元素都没找到。Java 8的库设计人员引入了Optional<T>，
         * 这样就不用返回众所周知容易出问题的null了。
         * isPresent()将在Optional包含值的时候返回true, 否则返回false。
         * ifPresent(Consumer<T> block)会在值存在的时候执行给定的代码块。我们在第3章
         * T get()会在值存在时返回值，否则抛出一个NoSuchElement异常。
         * T orElse(T other)会在值存在时返回值，否则返回一个默认值。
         */
        //findAny(menu);
        //findFirst();
        /**
         * 归约
         * 1.元素求和   sum
         * 2.最大值和最小值    max min
         */
        //reduce();
        /**
         * 数值流
         * Java 8引入了三个原始类型特化流接口来解决这个问题：IntStream、DoubleStream和LongStream，
         * 分别将流中的元素特化为int、long和double，从而避免了暗含的装箱成本。
         * 每个接口都带来了进行常用数值归约的新方法，比如对数值流求和的sum，找到最大元素的max。
         * 此外还有在必要时再把它们转换回对象流的方法。要记住的是，这些特化的原因并不在于流的复杂性，
         * 而是装箱造成的复杂性——即类似int和Integer之间的效率差异。
         *
         * 包含mapToInt、boxed
         */
        //mapToInt(menu);
        /**
         * 数值流应用：勾股数
         *
         * 包含mapToObj
         */
        //PythagoreanNumber();
        /**
         * 由值创建流
         * Stream.of
         */
        //streamOf();.
        /**
         * 由数组创建流
         * ArraysStream
         */
        //ArraysStream();
        /**
         * 由文件生成流
         * Files.lines
         */
        //FilesLines();
        /**
         * 由函数生成流：创建无限流
         * Stream API提供了两个静态方法来从函数生成流：Stream.iterate和Stream.generate。
         * 这两个操作可以创建所谓的无限流：不像从固定集合创建的流那样有固定大小的流。
         * 由iterate和generate产生的流会用给定的函数按需创建值，因此可以无穷无尽地计算下去！
         * 一般来说，应该使用limit(n)来对这种流加以限制，以避免打印无穷多个值。
         *
         * 1. 迭代    Stream.iterate  没有修改现有状态，但在每次迭代时会创建新的元组。
         * 2. 生成    Stream.generate getAsInt在调用时会改变对象的状态，由此在每次调用时产生新的值。
         */
        //StreamIterate();
        //StreamGenerate();
        /**
         * 收集器  Collectors
         *
         * groupingBy
         */
        //groupingBy(transactions);
        /**
         * collect是一个归约操作，就像reduce一样可以接受各种做法作为参数，将流中的元素累积成一个汇总结果。
         * 具体的做法是通过定义新的Collector接口来定义的
         * 因此区分Collection、Collector和collect是很重要的。
         *
         * 归约
         * 在需要将流项目重组成集合时，一般会使用收集器（Stream方法collect的参数）。
         * 再宽泛一点来说，但凡要把流中所有的项目合并成一个结果时就可以用。
         * 这个结果可以是任何类型，可以复杂如代表一棵树的多级映射，或是简单如一个整数——也许代表了菜单的热量总和。
         *
         * Collectors.counting
         * Collectors.maxBy
         * Collectors.minBy
         * Optional<Object> --> Optional，它是一个容器，可以包含也可以不包含值。
         *
         * 汇总
         * 另一个常见的返回单个值的归约操作是对流中对象的一个数值字段求和。或者你可能想要求平均数。这种操作被称为汇总操作。
         *
         * Collectors.summingInt()
         * Collectors.averagingInt
         * Collectors.summarizingInt
         * Collectors.joining()
         * Collectors.reducing()
         */
        collect(menu);
    }

    public static void sorted(List<Dish> menu) {
        //1.筛选后排序   sorted
        List<String> lowCaloriesDishName = menu.stream()
                .filter(d -> d.getCalories() < 350)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(Collectors.toList());
        System.out.println(lowCaloriesDishName);
    }

    public static void limit(List<Dish> menu) {
        //2.筛选后取前三个 limit
        List<String> list = menu.stream()
                .filter(d -> d.getCalories() < 450)
                .map(Dish::getName)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(list);
    }

    public static void sout(List<Dish> menu) {
        //3.展示内部迭代的过程
        List<String> list2 = menu.stream()
                .filter(
                        d -> {
                            //System.out.println("filtering " + d.getName());
                            return d.getCalories() < 350;
                        }
                )
                .map(
                        d -> {
                            //System.out.println("mapping " + d.getName());
                            return d.getName();
                        }
                )
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(list2);
    }

    public static void booleanTest(List<Dish> menu) {
        //4.根据boolean字段来筛选
        List<Dish> list3 = menu.stream()
                .filter(Dish::isVegetarian)
                .collect(Collectors.toList());
        System.out.println(list3);
    }

    public static void distinct(List<Dish> menu) {
        //5.distinct
        List<Integer> nums = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        List<Integer> list4 = nums.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(list4);
        nums.stream().filter(i -> i % 2 == 0).distinct().forEach(System.out::println);
    }

    public static void skip(List<Dish> menu) {
        //6.skip
        List<Dish> list5 = menu.stream()
                .filter(d -> d.getCalories() > 250)
                .skip(2)
                .collect(Collectors.toList());
        System.out.println(list5);
    }

    public static void getLength(List<Dish> menu) {
        //7.1 获取length
        List<Integer> list6 = menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(list6);
    }

    public static void flatmap(List<Dish> menu) {
        //7.2 flatmap (使用flatMap方法的效果是，各个数组并不是分别映射成一个流，而是映射成流的内容)
        //对于一张单词表，如何返回一张列表，列出里面各不相同的字符
        String[] s = {"Hello", "World"};
        List<String> worlds = Arrays.asList(s);
        //map返回的流实际上是Stream<String[]>类型的。
        List<String[]> collect = worlds.stream()
                .map(d -> d.split(""))
                .distinct()
                .collect(Collectors.toList());
        for (int i = 0; i < collect.size(); i++) {
            for (int j = 0; j < collect.get(i).length; j++) {
                System.out.print(collect.get(i)[j] + " ");
            }
            System.out.println();
        }
        //你真正想要的是用Stream<String>来表示一个字符流
        //此时只是将每个数组变成了独立的流
        Stream<String> worlds1 = Arrays.stream(s);
        List<Stream<String>> collect1 = worlds.stream()
                .map(d -> d.split(""))
                .map(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(collect1);

        //使用flatmap
        //flatmap方法让你把一个流中的每个值都换成另一个流，然后把所有的流连接起来成为一个流。
        List<String> list7 = worlds.stream()
                .map(d -> d.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list7);
    }

    public static void anyMatch(List<Dish> menu) {
        //anyMatch方法可以回答“流中是否有一个元素能匹配给定的谓词”。比如，你可以用它来看看菜单里面是否有素食可选择
        if (menu.stream().anyMatch(Dish::isVegetarian))
            System.out.println("Dish里有素食！");
        else
            System.out.println("Dish里没有素食！");
    }

    public static void allMatch(List<Dish> menu) {
        //allMatch方法的工作原理和anyMatch类似，但它会看看流中的元素是否都能匹配给定的谓词。
        //比如，你可以用它来看看菜品是否有利健康（即所有菜的热量都低于1000卡路里）
        if (menu.stream().allMatch(d -> d.getCalories() < 1000))
            System.out.println("有利健康！");
        else
            System.out.println("不利健康！");
    }

    public static void noneMatch(List<Dish> menu) {
        //和allMatch相对的是noneMatch。它可以确保流中没有任何元素与给定的谓词匹配。
        if (menu.stream().noneMatch(d -> d.getCalories() >= 1000))
            System.out.println("有利健康！");
        else
            System.out.println("不利健康！");
    }

    public static void findAny(List<Dish> menu) {
        //findAny方法将返回当前流中的任意元素。它可以与其他流操作结合使用。比如，你可能想找到一道素食菜肴。
        //会优先找出排在前面的符合项（我自己猜的，感觉应该不是）
        Optional<Dish> any = menu.stream().filter(Dish::isVegetarian).findAny();
        System.out.println(any);
        /**
         * Optional<T>类（java.util.Optional）是一个容器类，代表一个值存在或不存在。在
         * 上面的代码中，findAny可能什么元素都没找到。Java 8的库设计人员引入了Optional<T>，这
         * 样就不用返回众所周知容易出问题的null了。
         *
         * isPresent()将在Optional包含值的时候返回true, 否则返回false。
         * ifPresent(Consumer<T> block)会在值存在的时候执行给定的代码块。我们在第3章
         * T get()会在值存在时返回值，否则抛出一个NoSuchElement异常。
         * T orElse(T other)会在值存在时返回值，否则返回一个默认值。
         */
        menu.stream()
                .filter(Dish::isVegetarian)
                .findAny()
                .ifPresent(d -> System.out.println(d.getName()));
    }

    public static void findFirst() {
        /**
         * 有些流有一个出现顺序（encounter order）来指定流中项目出现的逻辑顺序（比如由List或
         * 排序好的数据列生成的流）。对于这种流，你可能想要找到第一个元素。为此有一个findFirst
         * 方法，它的工作方式类似于findany。
         * 例如，给定一个数字列表，下面的代码能找出第一个平方能被3整除的数
         */
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> first = list.stream()
                .map(d -> d * d)
                .filter(a -> a % 3 == 0)
                .findFirst();
        System.out.println(first.get());
    }

    public static void reduce() {
        /**
         * reduce接受两个参数：
         * 一个初始值，这里是0；
         * 一个BinaryOperator<T>来将两个元素结合起来产生一个新值，这里我们用的是
         * lambda (a, b) -> a + b。
         * 你也很容易把所有的元素相乘，只需要将另一个Lambda：(a, b) -> a * b传递给reduce操作就可以了：
         * int product = numbers.stream().reduce(1, (a, b) -> a * b);
         */
        List<Integer> numbers = Arrays.asList(4, 5, 3, 9);
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        /**
         * 在Java 8中，Integer类现在有了一个静态的sum
         * 方法来对两个数求和，这恰好是我们想要的，用不着反复用Lambda写同一段代码了：
         */
        int sum1 = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum1);

        /**
         * 只要用归约就可以计算最大值和最小值了！让我们来看看如何利用刚刚学到的reduce
         * 来计算流中最大或最小的元素。正如你前面看到的，reduce接受两个参数：
         *  一个初始值
         *  一个Lambda来把两个流元素结合起来并产生一个新值
         * Lambda是一步步用加法运算符应用到流中每个元素上的，如图5-7所示。因此，你需要一个给定两个元素能够返回最大值的Lambda。
         * reduce操作会考虑新值和流中下一个元素，并产生一个新的最大值，直到整个流消耗完！
         */
        /*int max = numbers.stream()
                .reduce(0, Integer::max);*/
        Optional<Integer> max = numbers.stream()
                .reduce(Integer::max);
        System.out.println(max);
        Optional<Integer> min = numbers.stream()
                .reduce(Integer::min);
        System.out.println(min.get());

    }

    public static void mapToInt(List<Dish> menu) {
        /**
         * 1. 映射到数值流
         * 将流转换为特化版本的常用方法是mapToInt、mapToDouble和mapToLong。
         * 这些方法和前面说的map方法的工作方式一样，只是它们返回的是一个特化流，而不是Stream<T>。
         * 例如，你可以像下面这样用mapToInt对menu中的卡路里求和
         *
         * 这里，mapToInt会从每道菜中提取热量（用一个Integer表示），并返回一个IntStream（而不是一个Stream<Integer>）。
         * 然后你就可以调用IntStream接口中定义的sum方法，对卡路里求和了！请注意，如果流是空的，sum默认返回0。
         * IntStream还支持其他的方便方法，如max、min、average等。
         */
        int calories = menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();
        System.out.println(calories);
        /**
         * 2. 转换回对象流
         * 同样，一旦有了数值流，你可能会想把它转换回非特化流。
         * 例如，IntStream上的操作只能产生原始整数：
         * IntStream 的 map 操作接受的 Lambda 必须接受 int 并返回 int （一个IntUnaryOperator）。
         * 但是你可能想要生成另一类值，比如Dish。
         * 为此，你需要访问Stream接口中定义的那些更广义的操作。要把原始流转换成一般流（每个int都会装箱成一个Integer）
         * 可以使用boxed方法
         */
        IntStream intStream = menu.stream().mapToInt(Dish::getCalories);
        Stream<Integer> stream = intStream.boxed();
        /**
         * 3. 默认值OptionalInt
         * 求和的那个例子很容易，因为它有一个默认值：0。(指的是上面的reduce方法中.reduce(0, (a,b) -> a+b);)
         * 但是，如果你要计算IntStream中的最大元素，就得换个法子了，因为0是错误的结果。
         * 如何区分没有元素的流和最大值真的是0的流呢？
         * 前面我们介绍了Optional类，这是一个可以表示值存在或不存在的容器。
         * Optional可以用Integer、String等参考类型来参数化。
         * 对于三种原始流特化，也分别有一个Optional原始类型特化版本：OptionalInt、OptionalDouble和OptionalLong。
         *
         * 例如，要找到IntStream中的最大元素，可以调用max方法，它会返回一个OptionalInt：
         */
        OptionalInt optionalInt = menu.stream().mapToInt(Dish::getCalories).max();
        //现在，如果没有最大值的话，你就可以显式处理OptionalInt去定义一个默认值了：
        int max = optionalInt.orElse(1);
        System.out.println(max);
        /**
         * 数值范围
         * 和数字打交道时，有一个常用的东西就是数值范围。
         * 比如，假设你想要生成1和100之间的所有数字。
         * Java 8引入了两个可以用于IntStream和LongStream的静态方法，帮助生成这种范围：
         * range和rangeClosed。这两个方法都是第一个参数接受起始值，第二个参数接受结束值。
         * 但range是不包含结束值的，而rangeClosed则包含结束值。让我们来看一个例子：
         */
        IntStream intStream1 = IntStream
                .rangeClosed(1, 100)
                .filter(d -> d % 2 == 0);
        System.out.println(intStream1.count());

        IntStream intStream2 = IntStream
                .range(1, 100)
                .filter(d -> d % 2 == 0);
        System.out.println(intStream2.count());

    }

    public static void PythagoreanNumber() {

        int a = 3;
        /**
         * 假设a的值是3，后续需自己取范围，此处只做假设
         * 1.第一步是定义一个三元数。这里你可以使用具有三个元素的int数组，比如new int[]{3, 4, 5}，来表示勾股数(3, 4, 5)。
         * 2.假定有人为你提供了三元数中的前两个数字：a和b。怎么知道它是否能形成一组勾股数呢？
         * 你需要测试a * a + b * b的平方根是不是整数
         * 3.现在需要创建一个三元组。你可以使用map操作
         */
        Stream<int[]> stream = IntStream.rangeClosed(1, 100)
                .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                .boxed()
                .map(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)});
        /**
         * 请注意，你在filter之后调用boxed， 从rangeClosed返回的IntStream生成一个Stream<Integer>。
         * 这是因为你的map会为流中的每个元素返回一个int数组。
         * 而IntStream中的map方法只能为流中的每个元素返回另一个int，这可不是你想要的！
         * 你可以用IntStream的mapToObj方法改写它，这个方法会返回一个对象值流
         */
        Stream<int[]> stream1 = IntStream.rangeClosed(1, 100)
                .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                .mapToObj(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)});
        /**
         * 这里有一个关键的假设：给出了a的值。
         * 现在，只要已知a的值，你就有了一个可以生成勾股数的流。
         * 如何解决这个问题呢？就像b一样，你需要为a生成数值！
         *
         * 好的，flatMap又是怎么回事呢？首先，创建一个从1到100的数值范围来生成a的值。
         * 对每个给定的a值，创建一个三元数流。要是把a的值映射到三元数流的话，就会得到一个由流构成的流。
         * flatMap方法在做映射的同时，还会把所有生成的三元数流扁平化成一个流。
         * 这样你就得到了一个三元数流。
         * 还要注意，我们把b的范围改成了a到100。没有必要再从1开始了，否则就会造成重复的三元数，例如(3,4,5)和(4,3,5)。
         */
        Stream<int[]> pythagoreanTriples =
                IntStream.rangeClosed(1, 100).boxed()
                        .flatMap(
                                a1 -> IntStream.rangeClosed(a1, 100)
                                        .filter(b -> Math.sqrt(a1 * a1 + b * b) % 1 == 0)
                                        .mapToObj(
                                                b -> new int[]{a1, b, (int) Math.sqrt(a1 * a1 + b * b)}
                                        )
                        );
        pythagoreanTriples.limit(5)
                .forEach(t -> System.out.println(t[0] + "," + t[1] + "," + t[2]));

    }

    public static void streamOf() {

        /**
         * 你可以使用静态方法Stream.of，通过显式值创建一个流。它可以接受任意数量的参数。
         * 例如，以下代码直接使用Stream.of创建了一个字符串流。
         * 然后，你可以将字符串转换为大写，再一个个打印出来
         */
        Stream<String> stream = Stream.of("Java 8", "Lambdas", "In", "Action");
        stream.map(String::toUpperCase).forEach(System.out::println);
        /**
         * 你可以使用empty得到一个空流
         */
        Stream<Object> stream1 = Stream.empty();

    }

    public static void ArraysStream() {

        /**
         * 你可以使用静态方法Arrays.stream从数组创建一个流。它接受一个数组作为参数。
         * 例如，你可以将一个原始类型int的数组转换成一个IntStream
         */
        int[] numbers = {2,3,5,7,11,13};
        int sum = Arrays.stream(numbers).sum();
        System.out.println(sum);

    }

    public static void FilesLines() {

        /**
         * Java中用于处理文件等I/O操作的NIO API（非阻塞 I/O）已更新，以便利用Stream API。
         * java.nio.file.Files中的很多静态方法都会返回一个流。
         * 例如，一个很有用的方法是Files.lines，它会返回一个由指定文件中的各行构成的字符串流。
         * 使用你迄今所学的内容，你可以用这个方法看看一个文件中有多少各不相同的词：
         *
         * 你可以使用Files.lines得到一个流，其中的每个元素都是给定文件中的一行。
         * 然后，你可以对line调用split方法将行拆分成单词。
         * 应该注意的是，你该如何使用flatMap产生一个扁平的单词流，而不是给每一行生成一个单词流。
         * 最后，把distinct和count方法链接起来，数数流中有多少各不相同的单词。
         */

        long uniqueWords = 0;
        Stream<String> lines = null;
        try {
            lines = Files.lines(Paths.get("C:\\Users\\Administrator\\Desktop\\桌面文件\\自用草稿\\111.txt"), Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件打开异常！");
        }
        //此处如果用map会给每一行生成单独的单词流而不能拼到一起去distinct，使用flatMap可以得到一个扁平的单词流
        uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" "))).distinct().count();
        System.out.println(uniqueWords);

    }

    public static void StreamIterate() {
        Stream.iterate(0, a -> a + 2)
                .limit(5)
                .forEach(System.out::println);
    }

    public static void StreamGenerate() {

        /**
         * 与iterate方法类似，generate方法也可让你按需生成一个无限流。
         * 但generate不是依次对每个新生成的值应用函数的。
         * 它接受一个Supplier<T>类型的Lambda提供新的值。
         */
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);


        /**
         * 我们使用的供应源（指向Math.random的方法引用）是无状态的：
         * 它不会在任何地方记录任何值，以备以后计算使用。
         * 但供应源不一定是无状态的。 重要！！！！！！
         * 你可以创建存储状态的供应源，它可以修改状态，并在为流生成下一个值时使用。
         * 举个例子，我们将展示如何利用generate创建测验5.4中的斐波纳契数列，
         * 这样你就可以和用iterate方法的办法比较一下。
         * 测验 ---> question5_4
         *
         *
         * getAsInt在调用时会改变对象的状态，由此在每次调用时产生新的值。
         * 相比之下，使用iterate的方法则是纯粹不变的：它没有修改现有状态，
         * 但在每次迭代时会创建新的元组。
         *
         * 请注意，因为你处理的是一个无限流，所以必须使用limit操作来显式限制它的大小；
         * 否则，终端操作（这里是forEach）将永远计算下去。
         * 同样，你不能对无限流做排序或归约，因为所有元素都需要处理，而这永远也完不成！
         */
        IntSupplier supplier = new IntSupplier() {
            private int previous = 0;
            private int current = 1;
            @Override
            public int getAsInt() {
                int oldPrevious = this.previous;
                int nextValue = this.previous + this.current;
                this.previous = this.current;
                this.current = nextValue;
                return oldPrevious;
            }
        };
        IntStream.generate(supplier).limit(5).forEach(System.out::println);


    }

    public static void groupingBy(List<Transaction> transactions) {

        /**
         * 把列表中的交易按日期分组
         *
         * groupingBy说的是“生成一个Map，它的键是（year）桶，值则是桶中那些元素的列表”。
         */
        Map<Integer, List<Transaction>> map = transactions
                .stream()
                .collect(Collectors.groupingBy(Transaction::getYear));
        //System.out.println(map);
        map.forEach((a,b) -> System.out.println(a + ":" + b));

    }

    public static void collect(List<Dish> menu) {


        /**
         * 归约
         * 利用counting工厂方法返回的收集器
         */
        Long collect = menu.stream().collect(Collectors.counting());
        System.out.println("collect -> " + collect);
        //更为直接的写法
        long count = menu.stream().count();
        System.out.println("count -> " + count);
        //查找流中的最大值和最小值
        Comparator<Dish> comparator = Comparator.comparingInt(Dish::getCalories);
        Optional<Dish> optionalMax = menu.stream().collect(Collectors.maxBy(comparator));
        Optional<Dish> optionalMin = menu.stream().collect(Collectors.minBy(comparator));
        System.out.println("optionalMax -> " + optionalMax);
        System.out.println("optionalMin -> " + optionalMin);

        /**
         * 汇总
         * Collectors类专门为汇总提供了一个工厂方法：Collectors.summingInt。
         * 它可接受一个把对象映射为求和所需int的函数，并返回一个收集器；
         * 该收集器在传递给普通的collect方法后即执行我们需要的汇总操作。
         *
         * 但汇总不仅仅是求和；
         * 还有Collectors.averagingInt，连同对应的averagingLong和averagingDouble可以计算数值的平均数
         *
         * 你可以使用summarizingInt工厂方法返回的收集器。
         * 例如，通过一次summarizing操作你可以就数出菜单中元素的个数，并得到菜肴热量总和、平均值、最大值和最小值
         *
         * joining工厂方法返回的收集器会把对流中每一个对象应用toString方法得到的所有字符
         * 串连接成一个字符串。这意味着你把菜单中所有菜肴的名称连接起来
         */
        Integer calories = menu.stream().collect(Collectors.summingInt(Dish::getCalories));
        System.out.println("calories -> " + calories);
        Double average = menu.stream().collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println("average -> " + average);
        IntSummaryStatistics collect1 = menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));
        System.out.println("collect1 -> " + collect1);
        //请注意，joining在内部使用了StringBuilder来把生成的字符串逐个追加起来
        String collect2 = menu.stream().map(Dish::getName).collect(Collectors.joining());
        System.out.println("collect2 -> " + collect2);
        //但该字符串的可读性并不好。幸好，joining工厂方法有一个重载版本可以接受元素之间的分界符
        //这样你就可以得到一个逗号分隔的菜肴名称列表
        String collect3 = menu.stream().map(Dish::getName).collect(Collectors.joining(", "));
        System.out.println("collect3 -> " + collect3);
        /**
         * 事实上，我们已经讨论的所有收集器，都是一个可以用reducing工厂方法定义的归约过程的特殊情况而已。
         * Collectors.reducing工厂方法是所有这些特殊情况的一般化
         *
         * 你可以把单参数reducing工厂方法创建的收集器看作三参数方法的特殊情况，
         * 它把流中的第一个项目作为起点，把恒等函数（即一个函数仅仅是返回其输入参数）作为一个转换函数。
         * 这也意味着，要是把单参数reducing收集器传递给空流的collect方法，收集器就没有起点
         */
        Integer collect4 = menu.stream().collect(Collectors.reducing(0, Dish::getCalories, (a, b) -> a + b));
        System.out.println("collect4 -> " + collect4);

        /**
         * 这个解决方案有两个问题：一个语义问题和一个实际问题。语义问题在于，reduce方法
         * 旨在把两个值结合起来生成一个新值，它是一个不可变的归约。与此相反，collect方法的设
         * 计就是要改变容器，从而累积要输出的结果。这意味着，上面的代码片段是在滥用reduce方
         * 法，因为它在原地改变了作为累加器的List。你在下一章中会更详细地看到，以错误的语义
         * 使用reduce方法还会造成一个实际问题：这个归约过程不能并行工作，因为由多个线程并发
         * 修改同一个数据结构可能会破坏List本身。在这种情况下，如果你想要线程安全，就需要每
         * 次分配一个新的List，而对象分配又会影响性能。这就是collect方法特别适合表达可变容
         * 器上的归约的原因，更关键的是它适合并行操作
         */
        Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5, 6).stream();
        List<Integer> numbers = stream.reduce(
                new ArrayList<Integer>(),
                (List<Integer> l, Integer e) -> {
                    l.add(e);
                    return l;
                },
                (List<Integer> l1, List<Integer> l2) -> {
                    l1.addAll(l2);
                    return l1;
                }
        );
        System.out.println("numbers -> " + numbers);

    }

}
