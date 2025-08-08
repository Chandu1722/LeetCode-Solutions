class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length;
        HashSet<List<Integer>> set = new HashSet<>();
        permutate(set, 0, nums, n);
        return new ArrayList<>(set);
    }

    public void permutate(HashSet<List<Integer>> set, int index, int[] arr, int n) {
        if (index == n) {
            set.add(savePer(arr));
        }
        for (int i = index; i < n; i++) {
            swap(arr, i, index);
            permutate(set, index + 1, arr, n);
            swap(arr, i, index);
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public List<Integer> savePer(int[] arr) {
        List<Integer> l = new ArrayList<>();
        for (int n : arr) {
            l.add(n);
        }
        return l;
    }
}
