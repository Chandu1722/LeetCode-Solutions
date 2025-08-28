class Solution {
    public boolean validTicTacToe(String[] board) {
        int x = 0, o = 0;
        char[][] tic = new char[3][3];
        int y = 0;
        for (String s : board) {
            tic[y++] = s.toCharArray();
        }
        for (char[] s : tic) {
            for (char c : s) {
                if (c == 'X')
                    x++;
                if (c == 'O')
                    o++;
            }
        }
        if (o > x || x - 1 > o)
            return false;
        boolean xWin = win(tic, 'X');
        boolean oWin = win(tic, 'O');
        if (xWin && oWin)
            return false;
        if (xWin && x != o + 1)
            return false;
        if (oWin && x != o)
            return false;
        return true;
    }

    public boolean win(char[][] tic, char player) {
        for (int i = 0; i < 3; i++) {
            if (tic[i][0] == player && tic[i][1] == player && tic[i][2] == player ||
                    tic[0][i] == player && tic[1][i] == player && tic[2][i] == player) {
                return true;
            }
        }
        if (tic[0][0] == player && tic[1][1] == player && tic[2][2] == player ||
                tic[2][0] == player && tic[1][1] == player && tic[0][2] == player) {
            return true;
        }
        return false;
    }
}
