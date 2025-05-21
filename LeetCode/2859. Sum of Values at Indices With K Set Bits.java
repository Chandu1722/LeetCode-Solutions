class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (binaryCount(i) == k) {
                sum += nums.get(i);
            }
        }
        return sum;
    }

    public static int binaryCount(int num) {
        String str = Integer.toBinaryString(num);
        int x = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                x++;
            }
        }
        return x;
    }
}
