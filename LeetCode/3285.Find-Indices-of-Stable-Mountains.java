class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i < height.length; i++) {
            int n = height[i - 1];
            if (n > threshold && i != 0)
                arr.add(i); 
        } 
        return arr;
    }
}
