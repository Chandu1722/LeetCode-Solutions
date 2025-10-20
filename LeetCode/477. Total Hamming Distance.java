class Solution {
    public int totalHammingDistance(int[] nums) {
        int ans = 0, n = nums.length;
        for (int i = 0; i < 32; i++) {
            int bitCount = 0;
            for (int num : nums) {
                bitCount += (num >> i) & 1;
            }
            ans += bitCount * (n - bitCount);
        }
        return ans;
    }
}
//         int n=nums.length;
//         int ans=0;
//         for(int i=0;i<n-1;i++){
//             for(int j=i+1;j<n;j++){
//                 ans+=hamming(nums[i],nums[j]);
//             }
//         }
//         return ans;
//     }
//     public static int hamming(int a,int b){
//         int xor=a^b;
//         int count=0;
//         while(xor!=0){
//             count+=xor&1;
//             xor=xor>>1;
//         }
//         return count;
//     }
// }
