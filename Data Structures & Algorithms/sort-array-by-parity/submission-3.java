class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ans[]=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int k=0;
        while(k<nums.length){
            if(nums[k]%2==0){
                ans[i]=nums[k];
                i++;
            }
            else{
                ans[j]=nums[k];
                j--;

            }
            k++;
        }

    return ans;   
    }
}