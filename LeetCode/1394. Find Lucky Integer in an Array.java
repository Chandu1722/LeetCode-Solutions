class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> nums = new HashMap<>();
        for (int n : arr) {
            nums.put(n, nums.getOrDefault(n, 0) + 1);
        }
        int ans = -1;
        for (Integer key : nums.keySet()) {
            if (key == nums.get(key)) {
                ans = Math.max(ans, key);
            }
        }
        return ans;

    }
}
