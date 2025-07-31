class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int x = capacity;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] <= x) {
                x -= plants[i];
                steps++;
            } else {
                x = capacity;
                steps += 2 * (i) + 1;
                x -= plants[i];
            }
        }
        return steps;
    }
}
