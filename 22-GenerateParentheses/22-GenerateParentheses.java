class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        String sb = new String();
        backtrack(n,n,sb);
        return ans;
    }
    private void backtrack(int open,int close,String sb){
        if(open==0 && close==0){
            ans.add(sb);
            return;
        }
        if(open>0)
            backtrack(open-1,close,sb+"(");
        if(close>open)
            backtrack(open,close-1,sb+")");
    }
}