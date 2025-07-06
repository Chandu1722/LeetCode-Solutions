class Solution {
    public int brokenCalc(int startValue, int target) {
        int ans = 0;
        if (startValue > target)
            return startValue - target;
        while (startValue < target) {
            if ((target & 1) == 1) {
                target++;
            } else {
                target /= 2;
            }
            ans++;
        }
        ans += startValue - target;
        return ans;
    }
}
