class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int i, j;
        for (i = 0; i < image.length; i++) {
            int l = 0;
            int r = image[0].length - 1;
            while (l <= r) {
                int t = image[i][l];
                image[i][l] = image[i][r];
                image[i][r] = t;
                l++;
                r--;
            }
        }

        for (i = 0; i < image.length; i++) {
            for (j = 0; j < image[0].length; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}
