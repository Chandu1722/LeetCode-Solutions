class Solution {
    public int[] sortArray(int[] nums) {
        int i = 0, j = nums.length - 1;
        mergeSort(nums, i, j);
        return nums;
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[mid + 1 + i];
        }
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        //copy remaining elelments if any
        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
}
//Using heap sort

//     public int[] sortArray(int[] nums) {
//         int n = nums.length;
//         for (int i = n / 2 - 1; i >= 0; i--) {
//             heapify(nums, n, i);
//         }
//         for (int i = n - 1; i >= 0; i--) {
//             swap(nums, 0, i);
//             heapify(nums, i, 0);
//         }
//         return nums;
//     }

//     public static void heapify(int[] arr, int n, int i) {
//         int largest = i;
//         int left = 2 * i + 1;
//         int right = 2 * i + 2;
//         if (left < n && arr[left] > arr[largest]) {
//             largest = left;
//         }
//         if (right < n && arr[right] > arr[largest]) {
//             largest = right;
//         }
//         if (largest != i) {
//             swap(arr, largest, i);
//             heapify(arr, n, largest);
//         }
//     }

//     public static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
// }
