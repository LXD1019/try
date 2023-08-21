package test.methodTest;

public class while_break_Test {
    public static void main(String[] args) {

        int a = 5;
        while (a>0) {
            if (a==3) {
                break;
            }
            a--;
        }
        System.out.println(a);

    }
}
