class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        int[] line = new int[n];
        boolean[] visited = new boolean[n];
        backtrack(nums,0,line,visited);

        return this.ans;
    }
    private void backtrack(int[]nums,int index,int[] line,boolean[] visited){
        if(index==nums.length){
            ans.add(Arrays.stream(line).boxed().toList());
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]==false){
                visited[i]=true;
                line[index]=nums[i];
                backtrack(nums,index+1,line,visited);
                visited[i]=false;
            }
        }
    }
}