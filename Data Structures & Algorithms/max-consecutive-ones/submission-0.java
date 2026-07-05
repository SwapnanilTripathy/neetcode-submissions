class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ct=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                ct++;
            }
            else ct=0;
            if(max<ct){
                max=ct;
            }  
        }
    return max;    
    }
}