package test.whatever;

import lombok.extern.slf4j.Slf4j;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class test {
    public static void main(String[] args) {

        /*String str = "00762807";

        System.out.println(UUID.randomUUID().toString().replace("-", ""));

        System.out.println(str.substring(0, 2));

        System.out.println(new SimpleDateFormat("yyyy/MM/dd/").format(new Date()));*/

        /*String a = "备案表";
        String b = a + ".doc";
        System.out.println(b);*/

        //System.out.println("1" + "\n 2");

        //System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        /*Long a = 8L;
        Long b = 8L;
        String c = "8";
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(Long.valueOf(c)));*/

        /*Calendar cal = Calendar.getInstance();
        int y = cal.get(Calendar.YEAR);
        int a = 1;
        String bh;
        for (int i = 1; i <= 5; i++) {
            String str = new DecimalFormat("0000").format(a);
            bh = "XFHT" + y + str;
            a = Integer.valueOf(bh.substring(8,12));
            a++;
            System.out.println(bh + " ==> " + bh.substring(8,12));
        }*/

        String a = "123 ";
        Integer b = Integer.parseInt(a.trim());
        System.out.println(b);




    }
}
