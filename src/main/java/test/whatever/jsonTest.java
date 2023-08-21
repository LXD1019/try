package test.whatever;

import com.alibaba.fastjson.JSON;
import test.entity.User;

public class jsonTest {

    public static void main(String[] args) {
        User user = new User();
        user.setId("1");
        user.setName("2");
        user.setAge("3");
        user.setAddress("4");
        String json = JSON.toJSONString(user);
        System.out.println(json);
    }
}
