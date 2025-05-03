class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (Character.isLetter(arr[left]) && Character.isLetter(arr[right])) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if (!(Character.isLetter(arr[left])))
                left++;
            if (!(Character.isLetter(arr[right])))
                right--;
        }
        String str = new String(arr);
        return str;
    }
}
