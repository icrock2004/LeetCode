class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        int sum = nums[i] + nums[j];
        while (sum != target) {
            j--;
            if (j == i) {
                j = nums.length-1;
                i++;
            }
            sum = nums[i] + nums[j];
        }
        int[] arr = {i,j};
        return arr;
    }
}