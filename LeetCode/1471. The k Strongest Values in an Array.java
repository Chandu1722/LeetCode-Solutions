class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1, p = 0;
        int m = arr[j / 2];
        int[] ans = new int[k];
        while (p < k) {
            if (m - arr[i] > arr[j] - m) {
                ans[p++] = arr[i++];
            } else {
                ans[p++] = arr[j--];
            }
        }
        return ans;
    }
}
