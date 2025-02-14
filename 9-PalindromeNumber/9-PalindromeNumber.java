class Solution {
    public boolean isPalindrome(int x) {
        int left = 0;
        String num = Integer.toString(x);
        int right =num.length()-1;
        while(left<right){
            if(num.charAt(left)!=num.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}