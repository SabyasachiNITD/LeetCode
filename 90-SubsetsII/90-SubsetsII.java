class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        backtrack(nums,0,temp);
        return ans;
    }
    private void backtrack(int[] nums,int idx,List<Integer> temp){
        if(idx==nums.length){
            if(ans.contains(temp)==false)
                ans.add(new ArrayList(temp));
            return;
        }
        temp.add(nums[idx]);
        backtrack(nums,idx+1,temp);
        temp.removeLast();
        backtrack(nums,idx+1,temp);
    }
}