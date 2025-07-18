class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
            set.add(reverse(i));
        }
        return set.size();
    }

    public static int reverse(int num) {
        int sum = 0;
        while (num > 0) {
            int r = num % 10;
            sum = sum * 10 + r;
            num /= 10;
        }
        return sum;
    }
}
