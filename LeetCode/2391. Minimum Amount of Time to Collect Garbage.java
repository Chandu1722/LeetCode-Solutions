class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int G = 0, M = 0, P = 0;
        int g = -1, m = -1, p = -1;
        int time = 0;
        for (int i = 0; i < garbage.length; i++) {
            time += garbage[i].length();
            if (garbage[i].contains("G")) {
                g = i;
            }
            if (garbage[i].contains("M")) {
                m = i;
            }
            if (garbage[i].contains("P")) {
                p = i;
            }
        }
        for (int i = 0; i < travel.length; i++) {
            if (i < g) {
                time += travel[i];
            }
            if (i < m) {
                time += travel[i];
            }
            if (i < p) {
                time += travel[i];
            }
        }
        return time;
    }
}
