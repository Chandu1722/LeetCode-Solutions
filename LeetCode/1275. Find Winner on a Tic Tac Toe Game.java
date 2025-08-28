class Solution {
    public String tictactoe(int[][] moves) {
        int n = moves.length;
        char player = 'A';
        char[][] tic = new char[3][3];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                tic[moves[i][0]][moves[i][1]] = 'X';
            else
                tic[moves[i][0]][moves[i][1]] = 'O';
        }
        if (win(tic, 'X'))
            return "A";
        if (win(tic, 'O'))
            return "B";
        return n == 9 ? "Draw" : "Pending";
    }

    public boolean win(char[][] tic, char player) {
        for (int i = 0; i < 3; i++) {
            if (tic[i][0] == player && tic[i][1] == player && tic[i][2] == player ||
                    tic[0][i] == player && tic[1][i] == player && tic[2][i] == player) {
                return true;
            }
            if (tic[0][0] == player && tic[1][1] == player && tic[2][2] == player ||
                    tic[2][0] == player && tic[1][1] == player && tic[0][2] == player) {
                return true;
            }
        }
        return false;
    }
}
