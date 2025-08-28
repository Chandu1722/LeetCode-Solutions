class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        for (int i = 1; i < n; i++) {
            topSort(grid, 0, i, n);
        }
        for (int i = 0; i < n; i++) {
            bottomSort(grid, i, 0, n);
        }
        return grid;
    }

    public void topSort(int[][] grid, int x, int y, int n) {
        List<Integer> arr = new ArrayList<>();
        for (int i = x, j = y; i < n && j < n; i++, j++) {
            arr.add(grid[i][j]);
        }
        Collections.sort(arr);
        int p = 0;
        for (int i = x, j = y; i < n && j < n; i++, j++) {
            grid[i][j] = arr.get(p++);
        }
    }

    public void bottomSort(int[][] grid, int x, int y, int n) {
        List<Integer> arr = new ArrayList<>();
        for (int i = x, j = y; i < n && j < n; i++, j++) {
            arr.add(grid[i][j]);
        }
        Collections.sort(arr);
        int p = arr.size() - 1;
        for (int i = x, j = y; i < n && j < n; i++, j++) {
            grid[i][j] = arr.get(p--);
        }
    }
}
