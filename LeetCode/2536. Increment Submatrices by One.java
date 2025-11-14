class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] mat=new int[n+1][n+1];
        for(int[] arr:queries){
            int r1=arr[0],c1=arr[1],r2=arr[2],c2=arr[3];
            mat[r1][c1]++;
            mat[r1][c2+1]--;
            mat[r2+1][c1]--;
            mat[r2+1][c2+1]++;
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                mat[i][j]+=mat[i][j-1];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                mat[j][i]+=mat[j-1][i];
            }
        }
        int ans[][] =new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=mat[i][j];
            }
        }
        return ans;
    }
}
