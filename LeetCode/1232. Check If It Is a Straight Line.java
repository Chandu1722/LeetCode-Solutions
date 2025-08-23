class Solution {
    public boolean checkStraightLine(int[][] nums) {
        int dx = nums[1][0] - nums[0][0];
        int dy = nums[1][1] - nums[0][1];
        for (int i = 2; i < nums.length; i++) {
            if (dy * (nums[i][0] - nums[0][0]) - dx * (nums[i][1] - nums[0][1]) != 0) {
                return false;
            }
        }
        return true;
    }
}
