class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] nums = Arrays.stream(arr).distinct().sorted().toArray();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i + 1);
        }
        for (int i = 0; i < n; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}
