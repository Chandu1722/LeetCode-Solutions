class Solution {
    public boolean isValidSudoku(char[][] board) {
        return checkRow(board) && checkCol(board) && checkGrid(board);
    }

    public boolean checkRow(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> seen = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char val = board[i][j];
                if (val != '.') {
                    if (!seen.add(val)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean checkCol(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> seen = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char val = board[j][i];
                if (val != '.') {
                    if (!seen.add(val)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean checkGrid(char[][] board) {
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!checkThree(board, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkThree(char[][] board, int row, int col) {
        HashSet<Character> set = new HashSet<>();
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                char val = board[i][j];
                if (val != '.') {
                    if (!set.add(val)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
