class Solution {
    public int numSub(String s) {
        int ans=0,count=0,mod=1000000007;
        for(char c:s.toCharArray()){
            if(c=='1') count++;
            else count=0;
            ans=(ans+count)%mod;
        }
        return ans;
    }
}
