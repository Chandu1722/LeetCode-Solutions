class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] item : items1) {
            map.put(item[0], map.getOrDefault(item[0], 0) + item[1]);
        }
        for (int[] item : items2) {
            map.put(item[0], map.getOrDefault(item[0], 0) + item[1]);
        }
        for (int key : map.keySet()) {
            list.add(Arrays.asList(key, map.get(key)));
        }
        list.sort((a, b) -> Integer.compare(a.get(0), b.get(0)));
        return list;
    }
}
