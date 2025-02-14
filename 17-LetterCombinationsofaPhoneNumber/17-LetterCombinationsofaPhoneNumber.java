class Solution {
    HashMap<Integer,String> mp = new HashMap<>();
    List<String> ans =new ArrayList<>();
    
    public List<String> letterCombinations(String digits) {
        if(digits.equals("")) return ans;
        ans=new ArrayList();
        mp.put(2,"abc");
        mp.put(3,"def");
        mp.put(4,"ghi");
        mp.put(5,"jkl");
        mp.put(6,"mno");
        mp.put(7,"pqrs");
        mp.put(8,"tuv");
        mp.put(9,"wxyz");
        StringBuilder sb = new StringBuilder();
        permute(digits,0,sb);
        return ans;
    }
    private void permute(String d,int index,StringBuilder sb){
        if(index==d.length()){
            ans.add(sb.toString());
            return;
        }
        String s = mp.get(d.charAt(index)-'0');
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            permute(d,index+1,sb);
            sb.setLength(sb.length() - 1);
        }
    }
}