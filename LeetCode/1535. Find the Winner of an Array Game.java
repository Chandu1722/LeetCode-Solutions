class Solution {
    public int getWinner(int[] arr, int k) {
        int count = 0;
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        if (k >= n) {
            for (int num : arr) {
                if (num > max)
                    max = num;
            }
            return max;
        }
        int winner = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > winner) {
                winner = arr[i];
                count = 1;
            } else {
                count++;
            }
            if (count == k) {
                return winner;
            }
        }
        return winner;
    }
}
