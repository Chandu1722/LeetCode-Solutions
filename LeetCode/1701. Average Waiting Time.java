class Solution {
    public double averageWaitingTime(int[][] customers) {
        double avgTime = 0;
        avgTime += customers[0][1];
        long t = customers[0][0] + customers[0][1];
        int n = customers.length;
        for (int i = 1; i < n; i++) {
            t = Math.max(customers[i][0], t) + customers[i][1];
            avgTime += t - customers[i][0];
        }
        return avgTime / n;
    }
}
