class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] ans = new int[n];
        int total = 0;
        Arrays.fill(ans,1);

        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1])
                ans[i] = ans[i-1]+1;
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1])
                ans[i]= Math.max(ans[i],ans[i+1]+1);
        }
        for(int i:ans) total+=i;
        return total;
    }
}