class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int n = map.size();
        int[] arr = new int[n];
        char[] ch = new char[n];
        int k = 0;
        for (char key : map.keySet()) {
            arr[k] = map.get(key);
            ch[k] = key;
            k++;
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    char t = ch[i];
                    ch[i] = ch[j];
                    ch[j] = t;
                }
            }
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i]; j++) {
                str.append(ch[i]);
            }
        }
        return str.toString();

    }
}
