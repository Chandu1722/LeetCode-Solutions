class Solution {
    public long maxRunTime(int n, int[] batteries) {
        Arrays.sort(batteries);
        long total = 0;
        for (int num : batteries) {
            total += num;
        }
        for (int i = batteries.length - 1; i >= 0; i--) {
            if (batteries[i] <= total / n)
                break;
            total -= batteries[i];
            n--;
        }
        return total / n;
    }
}
