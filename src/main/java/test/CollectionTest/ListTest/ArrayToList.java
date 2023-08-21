package test.CollectionTest.ListTest;

import java.util.List;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;


public class ArrayToList {

    public static void main(String[] args) {
        //定义二维数组字符串str1
        String str1 = "[[\"1\",\"2\",\"3\"],[\"12\",\"3\",\"4\"]]";
        //定义二维数组字符串str2
        String str2 = "[[1,2,3],[12,3,4]]";
        //将str1转换成二维数组parse1
        String[][] parse1 = JSON.parseObject(str1, String[][].class);
        //将str2转换成二维数组parse2
        String[][] parse2 = JSON.parseObject(str2, String[][].class);
        //将二维数组parse1转换为list
        List<List<String>> lists1 = JSON.parseObject(JSON.toJSONString(parse1), new TypeReference<List<List<String>>>() {});
        //将二维数组parse2转换为list
        List<List<String>> lists2 = JSON.parseObject(JSON.toJSONString(parse1), new TypeReference<List<List<String>>>() {});
        //将list1转换为二维数组
        String[][] parse3 = JSON.parseObject(JSON.toJSONString(lists1), String[][].class);
        //将list2转换为二维数组
        String[][] parse4 = JSON.parseObject(JSON.toJSONString(lists2), String[][].class);
        //打印数据
        System.out.println(JSON.toJSONString(parse1));

        System.out.println(JSON.toJSONString(parse2));

        System.out.println(JSON.toJSONString(lists1));

        System.out.println(JSON.toJSONString(lists2));

        System.out.println(JSON.toJSONString(parse3));

        System.out.println(JSON.toJSONString(parse4));
    }

}
