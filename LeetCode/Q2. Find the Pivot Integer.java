class Solution {
    public int pivotInteger(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i++;
        }
        int currSum = 0;
        i = 1;
        while (i <= n) {
            currSum += i;
            if (currSum == (sum + i - currSum)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
