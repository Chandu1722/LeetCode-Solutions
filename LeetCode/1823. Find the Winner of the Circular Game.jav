class Solution {
    public int findTheWinner(int n, int k) {
        int x = n;
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }
        int y = 0;
        int i = 0;
        while (x > 1) {
            if (arr[i] != 0) {
                y++;
                if (y == k) {
                    arr[i] = 0;
                    y = 0;
                    x--;
                }
            }
            i = (i + 1) % n;
        }
        for (int num : arr) {
            if (num != 0) {
                return num;
            }
        }
        return -1;
    }
}
