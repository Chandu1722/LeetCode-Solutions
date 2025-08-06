class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int x = capacityA;
        int y = capacityB;
        int left = 0;
        int right = plants.length - 1;
        int ans = 0;
        while (left <= right) {
            if (left == right) {
                int max = Math.max(x, y);
                if (max >= plants[left]) {
                    break;
                } else {
                    ans++;
                    break;
                }
            }
            if (x >= plants[left]) {
                x -= plants[left];
            } else {
                x = capacityA;
                x -= plants[left];
                ans++;
            }
            if (y >= plants[right]) {
                y -= plants[right];
            } else {
                y = capacityB;
                y -= plants[right];
                ans++;
            }
            left++;
            right--;
        }
        return ans;
    }
}
