package LeetCode;

public class offer13 {

    public static void main(String[] args) {

        System.out.println(movingCount(16, 8, 4));

    }


    //自己的想法：可以跨过不是上下左右紧挨的格子，单纯的计数整个方格内符合条件的格子数
    public static int movingCount1(int m, int n, int k) {

        int num = 0;
        if (m + n <= k)
            return m * n;
        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < m; i1++) {
                if (i / 10 > 0 || i1 / 10 > 0) {
                    int m1 = i / 10;
                    int m2 = i % 10;
                    int n1 = i1 / 10;
                    int n2 = i1 % 10;
                    if (m1 + m2 + n1 + n2 <= k) {
                        num++;
                    }
                } else {
                    if (i + i1 <= k)
                        num++;
                }
            }
        }
        return num;
    }

    //实际上是：必须上下左右格子挨着走，计算最多可以经过几个格子
    public static int movingCount(int m, int n, int k) {

        boolean[][] visited = new boolean[m][n];
        return dfs(0, 0, m, n, k, visited);

    }

    public static int dfs(int i, int j, int m, int n, int k, boolean visited[][]) {

        if (i < 0 || i >= m || j < 0 || j >= n || (i / 10 + i % 10 + j / 10 + j % 10) > k || visited[i][j])
            return 0;
        visited[i][j] = true;
        return dfs(i+1,j,m,n,k,visited) + dfs(i-1,j,m,n,k,visited) + dfs(i,j+1,m,n,k,visited) + dfs(i,j-1,m,n,k,visited) + 1;

    }

}
