package test.basic;

import java.text.DecimalFormat;

public class chuFaTest {

    public static void main(String[] args) {

        //float price = (float) 89.89;
        //int Num = 3;
        //float totalPrice = price * Num;
        //float num = (float) (Math.round(totalPrice * 100)) / 100;
        //如果要求精确4位就*10000然后/10000

        String a = "57412.12";
        String b = "9063.166391";
        double c = (Double.parseDouble(b)) / (Double.parseDouble(a)) * 10000;
        System.out.println("c -> " + c);
        //double num = (double)(Math.round(c*100)/100);
        DecimalFormat end = new DecimalFormat("#.0");
        String d = end.format(c);
        System.out.println("d -> " + d);

    }

}
