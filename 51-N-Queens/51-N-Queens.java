class Solution {
    List<List<String>> ans=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] mat = new char[n][n];
        for(char[] row:mat)
            Arrays.fill(row,'.');
        b(mat,0,n);
        return ans;
    }
    private void b(char[][] mat,int row,int n){
        if(row==n){
            List<String> board = new ArrayList<>();
            for(char[] r : mat)
                board.add(new String(r));
            ans.add(board);
            return;
        }
        for(int col=0;col<n;col++){
            if(isSafe(mat,row,col)==true){
                mat[row][col] = 'Q';
                b(mat,row+1,n);
                mat[row][col] = '.';
            }
        }
    }
    private boolean isSafe(char[][] mat,int row,int col){
        for(int i=row-1;i>=0;i--){
            if(mat[i][col]=='Q') return false;
        }
        for(int i=row-1,j=col+1;i>=0 && j<mat.length;i--,j++){
            if(mat[i][j]=='Q') return false;
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(mat[i][j]=='Q') return false;
        }
        return true;
    }
}