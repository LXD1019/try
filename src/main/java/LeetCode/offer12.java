package LeetCode;

public class offer12 {

    public static void main(String[] args) {

        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        System.out.println(exist1(board, "ABCB"));

    }

    public static boolean exist(char[][] board, String word) {

        /*

        A B C E
        S F C S
        A D E E

        ABCCED
         */
        char[] b = word.toCharArray();
        int length = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == b[length]) {

                }
            }
        }
        return false;
    }

    public static boolean exist1(char[][] board, String word) {
        if (word.length() == 0)
            return true;
        int m = board.length;       //行
        int n = board[0].length;    //列
        if (m * n < word.length())
            return false;
        int index = 0;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(index)) {
                    if (dfs(i, j, word, index, visited, board)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean dfs(int i, int j, String word, int index, boolean[][] visited, char[][] board) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || visited[i][j])
            return false;
        if (board[i][j] == word.charAt(index)) {
            if (index == word.length() - 1) {
                return true;
            } else {
                visited[i][j] = true;
                boolean res = dfs(i + 1, j, word, index + 1, visited, board)    //下
                        || dfs(i - 1, j, word, index + 1, visited, board)       //上
                        || dfs(i, j - 1, word, index + 1, visited, board)       //左
                        || dfs(i, j + 1, word, index + 1, visited, board);      //右
                visited[i][j] = false;
                return res;
            }
        }   //ABC
        return false;
    }

}
