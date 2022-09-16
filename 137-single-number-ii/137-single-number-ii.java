class Solution {
    public int singleNumber(int[] nums) {
     Arrays.sort(nums);
        int i =0;
        while(i < nums.length-1){
            if(nums[i]==nums[i+1] && nums[i+1] == nums[i+2])
                i+=3;
            else
                return nums[i];
        }
        return nums[i];
    }
}