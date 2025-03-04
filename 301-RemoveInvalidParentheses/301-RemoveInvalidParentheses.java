class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> removeInvalidParentheses(String s) {
        int mr = minRemoval(s);
        Set<String> visited = new HashSet<>();
        backtrack(mr,s,visited);
        return ans;
    }
    private void backtrack(int mr, String s,Set<String> visited){
        if(mr==0){
            if(minRemoval(s)==0 && ans.contains(s)==false)
                ans.add(s);
            return;
            
        }
        for(int i=0;i<s.length();i++){
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            if(visited.contains(left+right)==false){
                visited.add(left+right);
                backtrack(mr-1,left+right,visited);
            }
            else
                continue;
            
        }
    }
    private int minRemoval(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
                st.push('(');
            else if(s.charAt(i)==')'){
                if(st.size()==0 || st.peek()==')')
                    st.push(')');
                if(st.peek()=='(')
                    st.pop();
            }
            else
                continue;
        }
        return st.size();
    }
}