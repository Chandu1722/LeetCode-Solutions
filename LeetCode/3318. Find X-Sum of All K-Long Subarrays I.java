class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n=nums.length;
        int[] ans=new int[n-k+1];
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=0,y=0;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(l<i&&(i-l+1)>k){
                map.put(nums[l],map.getOrDefault(nums[l],0)-1);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                l++;
            }
            if((i-l+1)==k){
                ans[y++]=xsum(map,x);
            }
           
        }
         return ans;
    }
    public static int xsum(HashMap<Integer,Integer> map,int x){
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (b[0] == a[0]) return b[1] - a[1]; 
            return b[0] - a[0]; 
        });
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            pq.offer(new int[]{entry.getValue(),entry.getKey()});
        }
        int sum=0;
        while(x-->0&&!pq.isEmpty()){
            int[] top=pq.poll();
            int freq=top[0];
            int num=top[1];
            sum+=num*freq;
        }
        return sum;
    }
}
