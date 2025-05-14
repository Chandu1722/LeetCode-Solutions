class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if ((j - i) % 2 == 1) {
                    for (int x = i; x < j; x++) {
                        sum += arr[x];
                    }
                }
            }
        }
        return sum;
    }
}
