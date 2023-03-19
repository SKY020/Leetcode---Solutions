class Solution {
    public int differenceOfSum(int[] nums) {
        int sume = 0;
        int sumd = 0;
        for(int i = 0; i < nums.length ; i++){
            sume = sume + nums[i];
        
        while(nums[i] > 9){
            sumd = sumd + nums[i]%10;
            nums[i]/=10;
        }
            if(nums[i] <= 9){
                sumd = sumd + nums[i];
            }
        }
        return Math.abs(sume-sumd);
    }
}