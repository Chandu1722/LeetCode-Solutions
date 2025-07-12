class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        // int n = queries.length;
        // int[] arr = new int[n];
        // int m = 0;
        // for (int num : queries) {
        //     int j = 0;
        //     int y = -1;
        //     for (int i = 0; i < nums.length; i++) {
        //         if (nums[i] == x) {
        //             j++;
        //         }
        //         if (j == num) {
        //             y = i;
        //             break;
        //         }
        //     }
        //     arr[m++] = y;
        // }
        // return arr;
        List<Integer> pos = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                pos.add(i);
            }
        }
        int n = queries.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int k = queries[i];
            if (k <= pos.size()) {
                arr[i] = pos.get(k - 1);
            } else {
                arr[i] = -1;
            }
        }
        return arr;
    }
}
