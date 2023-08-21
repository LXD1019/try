package test.methodTest;

public class splitTest {

    public static void main(String[] args) {

        String a = "a,b,c,d";
        String[] b = a.split(",");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }

}
