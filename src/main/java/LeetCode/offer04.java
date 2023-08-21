package LeetCode;

public class offer04 {

    public static void main(String[] args) {
        int[][] nums = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(findNumberIn2DArray(nums,6));
    }

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {

        //行长度
        int a = matrix.length;
        if(a == 0) return false;
        //列长度
        int b = matrix[0].length;
        int c = 0;
        while (a>0 && c<b) {
            if (matrix[a-1][c] > target) {
                a--;
            } else if (matrix[a-1][c] < target) {
                c++;
            } else return true;/*if (matrix[a-1][c] == target) {
                return true;
            }*/
             /*else if (a<0 || c>b-1){
                return false;
            }*/
        }
        //如果遍历完还没找到则返回false
        return false;
    }

}
