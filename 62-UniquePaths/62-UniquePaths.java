class Solution {
    int[][] dp = new int[101][101];
    public int uniquePaths(int m, int n) {
        
        return backtrack(0,0,m,n);
    }
    public int backtrack(int i,int j,int m, int n){
        if(i>=m || j>=n) return 0;
        else if(i==m-1 && j==n-1)
            return 1;
        
        if(dp[i][j]!=0) return dp[i][j];
        dp[i][j] = backtrack(i+1,j,m,n) + backtrack(i,j+1,m,n);
        return dp[i][j];
            
    }
}