class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (gcd(i, j) == 1) {
                    list.add(j + "/" + i);
                }
            }
        }
        return list;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
