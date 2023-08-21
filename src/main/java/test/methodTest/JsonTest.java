package test.methodTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.*;

public class JsonTest {

    public static void main(String[] args) {

        Integer[][] str = new Integer[2][2];
        Integer[] in = {1,2,3,4,5};
        str[0][0] = 1;
        str[0][1] = 2;
        str[1][0] = 3;
        str[1][1] = 4;

        //ArrayList<Object> list = new ArrayList<>(Arrays.asList(in));

        /*ArrayList<Integer> list1 = new ArrayList<>(str.length);
        Collections.addAll(list1,in);*/

        List<List<String>> lists2 = JSON.parseObject(JSON.toJSONString(str), new TypeReference<List<List<String>>>() {});


        System.out.println(lists2);


    }

}
