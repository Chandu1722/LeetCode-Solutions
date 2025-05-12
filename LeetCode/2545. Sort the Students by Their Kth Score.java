class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int m = score.length;
        int n = score[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                if (score[i][k] < score[j][k]) {
                    int y = 0;
                    for (int x = 0; x < n; x++) {
                        int temp = score[i][y];
                        score[i][y] = score[j][y];
                        score[j][y] = temp;
                        y++;
                    }
                }
            }
        }
        return score;
    }
}
