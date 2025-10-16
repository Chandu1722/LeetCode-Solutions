class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        List<List<Integer>> list = new ArrayList<>();
        int x = 0;
        for (int key : map.keySet()) {
            for (int i = 0; i < map.get(key); i++) {
                if (i >= list.size()) {
                    list.add(new ArrayList<>());
                }
                list.get(i).add(key);
            }
        }
        return list;
    }
}
