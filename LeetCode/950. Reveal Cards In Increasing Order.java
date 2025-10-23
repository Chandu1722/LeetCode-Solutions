class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);
        int[] arr = new int[n];
        Deque<Integer> indices = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            indices.add(i);
        }
        for (int card : deck) {
            int i = indices.poll();
            arr[i] = card;
            if (!indices.isEmpty()) {
                indices.add(indices.poll());
            }
        }
        return arr;
    }
}
