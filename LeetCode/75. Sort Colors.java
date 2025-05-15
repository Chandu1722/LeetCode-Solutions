class Solution {
    public void sortColors(int[] nums) {
        int a = 0, b = 0, c = 0;
        for (int n : nums) {
            if (n == 0)
                a++;
            if (n == 1)
                b++;
            if (n == 2)
                c++;
        }
        int x = 0;
        for (int i = 0; i < a; i++) {
            nums[x++] = 0;
        }
        for (int i = 0; i < b; i++) {
            nums[x++] = 1;
        }
        for (int i = 0; i < c; i++) {
            nums[x++] = 2;
        }
    }
}
