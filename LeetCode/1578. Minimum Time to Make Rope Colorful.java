class Solution {
    public int minCost(String colors, int[] Time) {
        int sum = 0;
        int maxTime = Time[0];
        for (int i = 1; i < colors.length(); i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                sum += Math.min(maxTime, Time[i]);
                maxTime = Math.max(maxTime, Time[i]);
            } else {
                maxTime = Time[i];
            }
        }
        return sum;
    }
}
