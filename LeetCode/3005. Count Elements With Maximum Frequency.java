class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int a = 0, b = 0;
        for (Integer key : map.keySet()) {
            a = Math.max(a, map.get(key));
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) == a) {
                b += a;
            }
        }
        return b;
    }
}
