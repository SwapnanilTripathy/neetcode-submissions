class Solution {
    public boolean isMonotonic(int[] nums) {
        int k=0;
        int cti=0;
        int ctd=0;
        int cte=0;
        while(k<nums.length-1){
            if(nums[k]<nums[k+1]) cti++;
            else if(nums[k]>nums[k+1]) ctd++;
            else if(nums[k]==nums[k+1]) cte++;  
            k++;
        }
    if((cti+cte)==nums.length-1 || (ctd+cte)==nums.length-1) return true;
    else return false;    
    }
}