class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        int count = 0;
        int minLength = Integer.MAX_VALUE;
        int startIndex = -1;
        int l=0,r=0;
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++)
            mp.put(t.charAt(i),mp.getOrDefault(t.charAt(i),0)+1);
        while(r<m){
            char c = s.charAt(r);
            if(mp.containsKey(c) && mp.get(c)>0){
                count++;
            }
            mp.put(c,mp.getOrDefault(c,0)-1);
            while(count==n){
                if(minLength>r-l+1){
                    minLength = r-l+1;
                    startIndex = l;
                }
                char left = s.charAt(l);
                mp.put(left,mp.getOrDefault(left,0)+1);
                if(mp.get(left)>0)
                    count--;
                l++;
            }
            r++;
        }
        return startIndex==-1 ? "": s.substring(startIndex,startIndex+minLength);
        
        
    }
}