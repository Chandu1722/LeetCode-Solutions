 class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) { 
            List<Integer> row = new ArrayList<>();
            int num = 1;
            for (int j = 0; j <= i; j++) { 
                row.add(num);   
                num = num * (i - j) / (j + 1);
            }
            arr.add(row);
        }
        return arr;
    }
}
 
