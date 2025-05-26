class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        int odd = n / 2;
        int even = (n + 1) / 2;
        int[] oddArr = new int[odd];
        int[] evenArr = new int[even];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenArr[i / 2] = nums[i];
            } else {
                oddArr[i / 2] = nums[i];
            }
        }
        Arrays.sort(oddArr);
        Arrays.sort(evenArr);
        for (int i = 0, ei = 0, oi = odd - 1; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = evenArr[ei++];
            } else {
                nums[i] = oddArr[oi--];
            }
        }
        return nums;
    }
}
