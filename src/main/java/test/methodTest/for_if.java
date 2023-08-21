package test.methodTest;

public class for_if {
    public static void main(String[] args) {


        test3();


    }

    public static void test1(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i == 3) {
                System.out.println("break");
                continue;
            }
        }
    }

    public static void test2(){

        for (int i = 1; i <= 5; i++) {
            System.out.println("i ==> "+i);
            for (int i1 = 6; i1 <= 10; i1++) {
                if (i1==8){
                    break;
                }
                System.out.println("i1 ==> "+i1);
            }
        }

    }

    public static void test3(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("i ==> " + i);
            if (i == 3)
                break;
        }
    }

}
