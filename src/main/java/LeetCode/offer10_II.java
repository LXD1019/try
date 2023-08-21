package LeetCode;

public class offer10_II {

    public static void main(String[] args) {

        System.out.println(numWays1(4));

    }

    public static int numWays(int n) {

        int[] a = new int[n+1];
        a[0] = 1;
        a[1] = 1;
        a[2] = 2;
        for (int i = 3; i <= n; i++) {
            a[i] = (a[i-1] + a[i-2]) % 1000000007;
        }
        return a[n];
    }

    public static int numWays1(int n) {

        // 1 1 2 3 5 8 13
        int a = 1, b = 1, sum;
        for (int i = 2; i < n+1; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return b;
    }

}
