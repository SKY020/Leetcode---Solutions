class Solution {
    public boolean canJump(int[] nums) {
// By Sir
        // int n = nums.length;
        // if(n==1)
        //     return true;
        // int max = 0;
        // for(int index=0;index<n-1 && max>=index;index++){
        //     if(max<index+nums[index]){
        //         max = index + nums[index];
        //     }
        //     if(max>=n-1){
        //         return true;
        //     }
        // }
        // return false;
        
//    By tech dose
        int n = nums.length;
        int reach = 0;
        for(int i =0; i<n; i++){
            if(reach < i)
                return false;
            reach = Math.max(reach, i+nums[i]);
        }
        return true;
    }
}