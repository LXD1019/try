package test.whatever;

public class chouQian {

    public static void main(String[] args) {

        String[] view = {"方山","九凤谷","九畹溪","清江画廊","三峡大坝","三峡人家","屈原故里","三峡大瀑布","西陵峡口","百里荒","车溪","朝天吼","鸣翠谷"};
        double[] number = new double[13];
        int num = (int)(Math.random()*13);
        System.out.println("选择去 -> " + view[num]);

        for (int i = 0; i < 10000; i++) {
            int num1 = (int)(Math.random()*13);
            switch (num1) {
                case 0 : number[0]++;   break;
                case 1 : number[1]++;   break;
                case 2 : number[2]++;   break;
                case 3 : number[3]++;   break;
                case 4 : number[4]++;   break;
                case 5 : number[5]++;   break;
                case 6 : number[6]++;   break;
                case 7 : number[7]++;   break;
                case 8 : number[8]++;   break;
                case 9 : number[9]++;   break;
                case 10 : number[10]++; break;
                case 11 : number[11]++; break;
                case 12 : number[12]++; break;
            }
        }
        double result = 0;
        for (int i = 0; i < number.length; i++) {
            number[i] = number[i] / 10000;
            result += number[i];
            System.out.println("去" + view[i] + "的概率是 -> " + number[i]*100 + "%");
        }
        System.out.println("百分比总和为 -> " + result*100);
        
    }

}
