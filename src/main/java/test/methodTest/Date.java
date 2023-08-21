package test.methodTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {

    public static void main(String[] args) {


        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()));



    }

}
