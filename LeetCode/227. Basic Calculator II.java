class Solution {
    public int calculate(String s) {
        int n = s.length();
        if (n == 0)
            return 0;
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        int num = 0;
        char sign = '+';
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 + (int) (ch - '0');
            }
            if (!Character.isDigit(ch) && ch != ' ' || i == n - 1) {
                if (sign == '+') {
                    stack.push(num);
                } else if (sign == '-') {
                    stack.push(-num);
                } else if (sign == '*') {
                    stack.push(stack.pop() * num);
                } else if (sign == '/') {
                    stack.push(stack.pop() / num);
                }
                sign = ch;
                num = 0;
            }
        }
        for (int j : stack) {
            ans += j;
        }
        return ans;
    }
}
