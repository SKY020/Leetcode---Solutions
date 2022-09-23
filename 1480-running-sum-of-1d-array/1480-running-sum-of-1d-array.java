class Solution {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];
        int sum = 0;
        for(int i =0; i<len; i++){
            sum+=nums[i];
            arr[i] = sum;
        }
        return arr;
    }
}