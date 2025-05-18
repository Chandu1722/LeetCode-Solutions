class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < paths.size(); i++) {
            map.put(paths.get(i).get(0), paths.get(i).get(1));
        }
        String dest = "";
        for (String s : map.keySet()) {
            String str = map.get(s);
            if (!map.containsKey(str)) {
                return str;
            }
        }
        return dest;
    }
}
