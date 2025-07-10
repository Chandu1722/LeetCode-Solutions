class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<String> stack = new Stack<>();
        int x = 0;
        for (int i = 1; i <= n && x < target.length; i++) {
            if (target[x] == i) {
                stack.add("Push");
                x++;
            } else {
                stack.add("Push");
                stack.add("Pop");
            }
        }
        return stack;
    }
}
