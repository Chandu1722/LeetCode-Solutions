class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int num = 0;
        int ans = 0;
        int sign = 1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 + (int) (ch - '0');
            } else if (ch == '+') {
                ans += sign * num;
                num = 0;
                sign = 1;
            } else if (ch == '-') {
                ans += sign * num;
                num = 0;
                sign = -1;
            } else if (ch == '(') {
                stack.push(ans);
                stack.push(sign);
                ans = 0;
                sign = 1;
            } else if (ch == ')') {
                ans += sign * num;
                num = 0;
                ans *= stack.pop();
                ans += stack.pop();
            }
        }
        if (num != 0) {
            ans += sign * num;
        }
        return ans;
    }
}
