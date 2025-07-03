class Solution {
    public String toHex(int num) {
        if (num == 0)
            return "0";
        StringBuilder str = new StringBuilder();
        char[] ch = "0123456789abcdef".toCharArray();
        while (num != 0) {
            int rem = num & 15;
            str.append(ch[rem]);
            num >>>= 4;
        }
        return str.reverse().toString();
    }
}
