class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> sol = new ArrayList<>();
        char[][] boards = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(boards[i], '.');
        }
        backtrack(sol, boards, 0, n);
        return sol;
    }

    public void backtrack(List<List<String>> sol, char[][] boards, int row, int n) {
        if (row == n) {
            sol.add(saveBoard(boards));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isSafe(boards, row, i, n)) {
                boards[row][i] = 'Q';
                backtrack(sol, boards, row + 1, n);
                boards[row][i] = '.';
            }
        }
    }

    public boolean isSafe(char[][] boards, int row, int col, int n) {
        for (int i = 0; i < row; i++) {
            if (boards[i][col] == 'Q') {
                return false;
            }
        }
        int r = row;
        for (int i = col; i >= 0 && r >= 0; i--, r--) {
            if (boards[r][i] == 'Q') {
                return false;
            }
        }
        r = row;
        for (int i = col; i < n && r >= 0; i++, r--) {
            if (boards[r][i] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public List<String> saveBoard(char[][] boards) {
        List<String> result = new ArrayList<>();
        for (char[] row : boards) {
            result.add(new String(row));
        }
        return result;
    }
}
