class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int x = -1;
        int n = arr.length;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                x = i;
                break;
            }
        }
        if (x == -1) {
            reverse(arr, 0, n - 1);
            return;
        }
        for (int i = n - 1; i > x; i--) {
            if (arr[i] > arr[x]) {
                int t = arr[i];
                arr[i] = arr[x];
                arr[x] = t;
                break;
            }
        }
        reverse(arr, x + 1, n - 1);
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i <= j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }
}
