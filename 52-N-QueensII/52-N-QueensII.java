class Solution {
    int count = 0;
    public int totalNQueens(int n) {
        int[][] mat = new int[n][n];
        backtrack(mat,0,n);
        return count;
    }
    private void backtrack(int[][] mat,int row,int n){
        if(row==n){
            this.count++;
            return;
        }
        for(int col=0;col<n;col++){
            if(isSafe(mat,row,col)==true){
                mat[row][col] = 1;
                backtrack(mat,row+1,n);
                mat[row][col] = 0;
            }
        }
    }
    private boolean isSafe(int[][]mat, int row,int col){
        for(int i=row-1;i>=0;i--){
            if(mat[i][col]==1) return false;
        }
        for(int i=row-1,j=col+1;i>=0 && j<mat.length;i--,j++){
            if(mat[i][j]==1) return false;
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(mat[i][j]==1) return false;
        }
        return true;
    }

}