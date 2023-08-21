package test.CollectionTest.ListTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class streamTest {

    public static void main(String[] args) {
        Bean bean1 = new Bean(1, "a", "za");
        Bean bean2 = new Bean(2, "b", "zb");
        Bean bean3 = new Bean(3, "c", "zc");

        ArrayList<Bean> list1 = new ArrayList();
        list1.add(bean1);
        list1.add(bean2);
        list1.add(bean3);

        //获取list1中的所有Bean对象的id，放入另一个list数组
        //注意，这个.map()方法返回的还是流对象，而不是返回map的意思

        //.stream().map().collect()
        List<Long> ids = list1.stream().map(bean -> bean.getId()).collect(Collectors.toList());
        System.out.println("ids" + ids);

        //使用filter方法，筛选list1中的所有Bean对象，留下id属于ids中的Bean对象，并把它们的name字段转成一个list
        //删除一个，便于看出差别来
        ids.remove(0);

        //.stream().filter().map().collect()
        List<String> names = list1.stream().filter(bean -> ids.contains(bean.getId())).map(Bean::getName).collect(Collectors.toList());
        System.out.println("names" + names);


        //把list1中的所有Bean对象转成map，其中，id是map的key，Bean对象本身是map的value

        //.stream().collect()
        Map<Long, Bean> maps = list1.stream().collect(java.util.stream.Collectors.toMap(Bean::getId, e -> e));
        System.out.println("maps" + maps);
        Set<Long> longs = maps.keySet();
        for (Long l : longs) {
            System.out.print("l" + l + " " + maps.get(l).getName() + " | ");
        }
        System.out.println();


        //按条件过滤后生成map，与上方的filter类似，只保留ids中有的id的bean对象

        //.stream().filter().collect()

        Map<Long, Bean> maps2 = list1.stream().filter(bean -> ids.contains(bean.getId())).collect(java.util.stream.Collectors.toMap(Bean::getId, e -> e));
        System.out.println("ids" + maps2);
        Set<Long> longs2 = maps2.keySet();
        for (Long l : longs2) {
            System.out.print("ids" + l + " " + maps2.get(l).getName() + " | ");
        }
        System.out.println();


    }

    static class Bean {
        private long id;
        private String name;
        private String address;

        public Bean(long id, String name, String address) {
            this.id = id;
            this.name = name;
            this.address = address;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

}
