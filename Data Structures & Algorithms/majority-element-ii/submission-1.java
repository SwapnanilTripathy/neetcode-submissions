class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        if (nums.length == 0)
            return ans;

        Arrays.sort(nums);

        int n = nums.length;
        int count = 1;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            } else {
                if (count > n / 3) {
                    ans.add(nums[i]);
                }
                count = 1;
            }
        }

        // Check the last group
        if (count > n / 3) {
            ans.add(nums[n - 1]);
        }

        return ans;
    }
}