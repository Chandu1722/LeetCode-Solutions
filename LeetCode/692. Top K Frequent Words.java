class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<String> heap = new PriorityQueue<>((w1, w2) -> {
            if (map.get(w1).equals(map.get(w2))) {
                return w1.compareTo(w2);
            }
            return map.get(w2) - map.get(w1);
        });
        heap.addAll(map.keySet());
        for (int i = 0; i < k && !heap.isEmpty(); i++) {
            list.add(heap.poll());
        }
        return list;
    }
}
