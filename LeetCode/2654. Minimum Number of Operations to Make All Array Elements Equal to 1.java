class Solution {
    public int minOperations(int[] nums) {
       int ones=0;
        int n=nums.length;
        for(int num:nums){
            if(num==1) ones++;
        }
        if(ones>0) return n-ones;
        int minLen=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int g=nums[i];
            for(int j=i+1;j<n;j++){
                g=gcd(g,nums[j]);
                if(g==1){
                    minLen=Math.min(minLen,j-i+1);
                    break;
                }
            }
        }
        return minLen==Integer.MAX_VALUE?-1:(minLen+n-2);
    }
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
