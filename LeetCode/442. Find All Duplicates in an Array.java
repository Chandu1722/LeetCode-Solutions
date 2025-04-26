class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> arr = new HashMap<>();
        for (int n : nums) {
            arr.put(n, arr.getOrDefault(n, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (Integer n : arr.keySet()) {
            if (arr.get(n) > 1)
                result.add(n);
        }
        return result;
    }
}
