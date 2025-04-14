class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for (char ch : s.toCharArray()) {

            if (Character.isLetter(ch) || Character.isDigit(ch))
                str.append(Character.toLowerCase(ch));
        }
        int left = 0;
        int right = str.length() - 1;
        while (left <= right) {
            char a = str.charAt(left);
            char b = str.charAt(right);
            if (!(a == b))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
