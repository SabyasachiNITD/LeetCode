class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int[] line = new int[nums.length];
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        permute(nums,0,mp,line);
        return ans;
    }
    private void permute(int[] nums,int index,HashMap<Integer,Integer> mp,int[]line){
        if(index==nums.length){
            ans.add(Arrays.stream(line).boxed().toList());
            return;
        }
        for(Map.Entry<Integer,Integer> e: mp.entrySet()){
            int key = e.getKey();
            int value = e.getValue();
            //System.out.print(key+" "+value+"\n");
            if(value>0){
                mp.put(key,value-1);
                line[index] = key;
                permute(nums,index+1,mp,line);
                mp.put(key,value);
            }
        }
    }
}