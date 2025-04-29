class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> arr = new HashMap<>();
        for (char c : s.toCharArray()) {
            arr.put(c, arr.getOrDefault(c, 0) + 1);
        }
        int n = arr.get(s.charAt(0));
        for (Character c : arr.keySet()) {
            if (n != arr.get(c))
                return false;
        }
        return true;
    }
}
