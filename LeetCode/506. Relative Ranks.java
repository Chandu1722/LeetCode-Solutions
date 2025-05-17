class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] arr = Arrays.stream(score).sorted().toArray();
        HashMap<Integer, Integer> map = new HashMap<>();
        int x = 1;
        for (int i = n - 1; i >= 0; i--) {
            map.put(arr[i], x++);
        }
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            if (map.get(score[i]) == 1) {
                str[i] = "Gold Medal";
            } else if (map.get(score[i]) == 2) {
                str[i] = "Silver Medal";
            } else if (map.get(score[i]) == 3) {
                str[i] = "Bronze Medal";
            } else {
                str[i] = String.valueOf(map.get(score[i]));
            }
        }
        return str;
    }
}
