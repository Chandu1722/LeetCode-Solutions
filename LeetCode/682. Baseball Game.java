class Solution {
    public int calPoints(String[] o) {
        Stack<Integer> arr = new Stack<>();
        for (String str : o) {
            if (str.equals("+")) {
                int s1 = arr.pop();
                int s2 = arr.peek();
                arr.push(s1);
                arr.push(s1 + s2);

            } else if (str.equals("C")) {
                arr.pop();

            } else if (str.equals("D")) {
                arr.push(arr.peek() * 2);
            } else {
                arr.push(Integer.valueOf(str));
            }
        }
        int sum = 0;
        while (!arr.isEmpty()) {
            sum += arr.pop();
        }
        return sum;
    }
}
