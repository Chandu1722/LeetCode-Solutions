class Solution {
    public int lengthOfLongestSubstring(String s) {
        /* if(s.length()==0) return 0;
        // int ans=0;
        int length=s.length();
        int maxAns=0;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<=length;j++){
                if(subString1(s.substring(i,j))){
                   maxAns=Math.max(maxAns,j-i);
                }
            }
        }
        return maxAns;
        }
        public static boolean subString1(String str){
        HashSet<Character> seen=new HashSet<>();
        for(char c:str.toCharArray()){
            if(seen.contains(c)) return false;
            seen.add(c);
        }
        return true;
        }*/
        int n = s.length();
        int left = 0;
        int right = 0;
        int maxLen = 0;
        HashSet<Character> seen = new HashSet<>();
        while (right < n) {
            if (!seen.contains(s.charAt(right))) {
                seen.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                seen.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
}
