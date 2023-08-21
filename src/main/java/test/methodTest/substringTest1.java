package test.methodTest;

import java.text.DecimalFormat;
import java.util.Calendar;

public class substringTest1 {
    public static void main(String[] args) {
        int num = Integer.valueOf("XFHT20230008".substring(8,12));
        System.out.println(num);

        int num1 = Integer.valueOf("JS4205022023666".substring(12,15));
        System.out.println(num1);

        String babh = "JS"
                + "420502"
                + Calendar.getInstance().get(Calendar.YEAR)
                + new DecimalFormat("000").format(50);
        System.out.println(babh);

    }
}
