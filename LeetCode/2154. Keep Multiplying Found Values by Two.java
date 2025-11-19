class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums)
            set.add(n);
        for (int n : nums) {
            if (set.contains(original))
                original *= 2;
        }
        return original;
    }
}
