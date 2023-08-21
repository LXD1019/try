package test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
//《Java8实战》流章节的实体类
public class Dish {

    private  String name;
    private  boolean vegetarian;
    private  int calories;
    private final Type type;

    public enum Type { MEAT, FISH, OTHER }

}
