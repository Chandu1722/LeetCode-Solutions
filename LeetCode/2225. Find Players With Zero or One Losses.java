class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> player = new HashSet<>();
        for (int[] mat : matches) {
            int win = mat[0];
            int lose = mat[1];
            player.add(win);
            player.add(lose);
            map.put(lose, map.getOrDefault(lose, 0) + 1);
        }
        for (int n : player) {
            int lose = map.getOrDefault(n, 0);
            if (lose == 0) {
                list.get(0).add(n);
            }
            if (lose == 1) {
                list.get(1).add(n);
            }
        }
        Collections.sort(list.get(0));
        Collections.sort(list.get(1));
        return list;
    }
}
