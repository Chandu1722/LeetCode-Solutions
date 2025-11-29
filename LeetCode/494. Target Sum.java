class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int n : nums) {
            HashMap<Integer, Integer> temp = new HashMap<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int total = entry.getKey();
                int value = entry.getValue();
                temp.put(total + n, temp.getOrDefault(total + n, 0) + value);
                temp.put(total - n, temp.getOrDefault(total - n, 0) + value);

            }
            map = temp;
        }
        return map.getOrDefault(target, 0);
    }
}
