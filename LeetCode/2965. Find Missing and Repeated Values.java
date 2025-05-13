class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr = new int[2];
        int n = grid.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map.put(grid[i][j], map.getOrDefault(grid[i][j], 0) + 1);
            }
        }
        for (int i = 1; i <= n * n; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2) {
                    arr[0] = i;
                }
            } else {
                arr[1] = i;
            }
        }
        return arr;
    }
}
