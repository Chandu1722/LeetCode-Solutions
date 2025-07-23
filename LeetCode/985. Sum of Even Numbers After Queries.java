class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n = queries.length;
        int[] arr = new int[n];
        int k = 0;
        for (int[] q : queries) {
            nums[q[1]] += q[0];
            arr[k++] = evenSum(nums);
        }
        return arr;
    }

    public static int evenSum(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            if (n % 2 == 0)
                sum += n;
        }
        return sum;
    }
}
