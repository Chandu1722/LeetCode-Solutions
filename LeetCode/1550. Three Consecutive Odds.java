class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int i = 0;
        for (int num : arr) {
            if (num % 2 != 0)
                i++;
            else
                i = 0;
            if (i == 3)
                return true;
        }
        return false;
    }
}
