class Solution {
    public int totalNQueens(int n) {
        int[] ans = new int[1];
        char[][] boards = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(boards[i], '.');
        }
        backtrack(ans, boards, 0, n);
        return ans[0];
    }

    public void backtrack(int[] ans, char[][] boards, int row, int n) {
        if (row == n) {
            ans[0]++;
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isSafe(boards, row, i, n)) {
                boards[row][i] = 'Q';
                backtrack(ans, boards, row + 1, n);
                boards[row][i] = '.';
            }
        }
    }

    public boolean isSafe(char[][] boards, int row, int col, int n) {
        for (int i = 0; i < row; i++) {
            if (boards[i][col] == 'Q')
                return false;
        }
        int r = row;
        for (int i = col; i >= 0 && r >= 0; i--, r--) {
            if (boards[r][i] == 'Q')
                return false;
        }
        r = row;
        for (int i = col; i < n && r >= 0; i++, r--) {
            if (boards[r][i] == 'Q')
                return false;
        }
        return true;
    }
}
