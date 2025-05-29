class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c = 0;
        for (int num : arr1) {
            boolean isValid = true;
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(num - arr2[j]) <= d) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                c++;
            }
        }
        return c;
    }
}
