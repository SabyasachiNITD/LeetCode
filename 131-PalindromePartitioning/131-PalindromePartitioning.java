class Solution {
    
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();
        backtrack(s,0,path,ans);
        return ans;
    }

    private void backtrack(String s,int idx, List<String> path,List<List<String>> ans){
        if(idx==s.length())
        {
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=idx;i<s.length();++i){
            if(isPalindrome(s,idx,i)){
                path.add(s.substring(idx,i+1));
                backtrack(s,i+1,path,ans);
                path.remove(path.size()-1);
            }
        }
    }
    private boolean isPalindrome(String s,int start, int end){
        while(start<end){
            if(s.charAt(start++)!=s.charAt(end--))
                return false;
        }
        return true;
    }
}