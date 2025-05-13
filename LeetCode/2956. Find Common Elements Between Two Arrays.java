class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> map1 = new HashSet<>();
        HashSet<Integer> map2 = new HashSet<>();
        for (int n : nums1) {
            map1.add(n);
        }
        for (int n : nums2) {
            map2.add(n);
        }
        int x = 0;
        for (int n : nums1) {
            if (map2.contains(n))
                x++;
        }
        int y = 0;
        for (int n : nums2) {
            if (map1.contains(n))
                y++;
        }
        return new int[] { x, y };
    }
}
