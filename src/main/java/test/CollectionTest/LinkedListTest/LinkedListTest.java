package test.CollectionTest.LinkedListTest;

import java.util.Iterator;
import java.util.LinkedList;

class Product {
    // 商品类
    private int id; // 商品编号
    private String name; // 名称
    private float price; // 价格
    public Product(int id, String name, float price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }
    // 这里是上面3个属性的setter/getter方法，这里省略
    public String toString() {
        return "商品编号：" + id + "，名称：" + name + "，价格：" + price;
    }
}
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> products = new LinkedList<String>(); // 创建集合对象
        String p1 = new String("六角螺母");
        String p2 = new String("10A 电缆线");
        String p3 = new String("5M 卷尺");
        String p4 = new String("4CM 原木方板");
        products.add(p1); // 将 p1 对象添加到 LinkedList 集合中
        products.add(p2); // 将 p2 对象添加到 LinkedList 集合中
        products.add(p3); // 将 p3 对象添加到 LinkedList 集合中
        products.add(p4); // 将 p4 对象添加到 LinkedList 集合中
        String p5 = new String("标准文件夹小柜");
        products.addLast(p5); // 向集合的末尾添加p5对象
        System.out.print("*************** 商品信息 ***************");
        System.out.println("\n目前商品有：");
        for (int i = 0; i < products.size(); i++) {
            System.out.print(products.get(i) + "\t");
        }
        System.out.println("\n第一个商品的名称为：" + products.getFirst());
        System.out.println("最后一个商品的名称为：" + products.getLast());
        products.removeLast(); // 删除最后一个元素
        System.out.println("删除最后的元素，目前商品有：");
        for (int i = 0; i < products.size(); i++) {
            System.out.print(products.get(i) + "\t");
        }
    }

    public static void main1(String[] args) {

        LinkedList products = new LinkedList<>();
        products.add(new Product(1,"asd",1));
        Iterator it = products.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        LinkedList<String> list = new LinkedList<>();
        list.add("666");
        System.out.println(list);

    }

}
