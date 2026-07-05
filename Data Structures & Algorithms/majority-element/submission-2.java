class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int ct=1;
        int j=0;
        int max=nums[0];
        int maxFreq = 0;
        int freq[] = new int[nums.length];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) ct++;
            else{
                freq[j]=ct;
                if(freq[j] > maxFreq) {
                    maxFreq = freq[j];
                    max = nums[i];
                }
                ct=1;
                j++;
            } 
        }
        freq[j]=ct;
        if(freq[j] > maxFreq) max = nums[nums.length-1];
        return max;
    }
}