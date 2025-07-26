class Solution {
    public String sortString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        StringBuffer str = new StringBuffer();
        boolean condition = true;
        while (condition) {
            for (char i = 'a'; i <= 'z'; i++) {
                if (map.containsKey(i) && map.get(i) > 0) {
                    str.append(i);
                    map.put(i, map.getOrDefault(i, 0) - 1);
                }
            }
            for (char i = 'z'; i >= 'a'; i--) {
                if (map.containsKey(i) && map.get(i) > 0) {
                    str.append(i);
                    map.put(i, map.getOrDefault(i, 0) - 1);
                }
            }
            condition = false;
            for (int val : map.values()) {
                if (val != 0) {
                    condition = true;
                    break;
                }
            }
        }
        return str.toString();
    }
}
