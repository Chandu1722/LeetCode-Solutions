class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m + n];
        int k = 0;
        for (int i = 0; i < m; i++)
            arr[k++] = nums1[i];
        for (int i = 0; i < n; i++)
            arr[k++] = nums2[i];
        Arrays.sort(arr);
        if ((m + n) % 2 != 0)
            return (double) arr[(m + n) / 2];
        return ((double) (arr[(m + n) / 2] + arr[(m + n) / 2 - 1])) / 2.0;
    }
}
