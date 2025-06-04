class Solution {
    public List<Integer> getRow(int r) {
        List<Integer> arr = new ArrayList<>();
        long num = 1;
        arr.add((int) num);
        for (int i = 1; i <= r; i++) {
            num = num * (r - i + 1) / i;
            arr.add((int) num);
        }
        return arr;
    }
}
