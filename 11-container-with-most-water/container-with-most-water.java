class Solution {
    public int maxArea(int[] h) {
        int left = 0, right = h.length-1;
        int n = h.length;
        int maxArea = 0;
        while(left<right){
            maxArea= Math.max(maxArea,Math.min(h[left],h[right])*(right-left));
            if(h[left]<h[right]) left++;
            else right--;
        }
        return maxArea;
        
    }
}