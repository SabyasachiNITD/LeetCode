class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> line = new ArrayList<>();
        subset(nums,0,line);
        return this.ans;
    }
    private void subset(int[] nums,int index,List<Integer> line){
        if(index==nums.length){
            ans.add(new ArrayList<>(line));
            return;
        }
        line.add(nums[index]);
        subset(nums,index+1,line);
        line.removeLast();
        subset(nums,index+1,line);
    }
}