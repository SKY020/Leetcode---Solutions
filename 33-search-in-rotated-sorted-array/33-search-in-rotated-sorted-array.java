class Solution 
{
    public int search(int[] nums, int target){
        int temp = -1;
        int left =0;
        int right = nums.length -1;
        while(left <= right){
            if(nums[left] == target)
                return left;
            else if(nums[right] == target)
                return right;
            else if(nums[left]<target)
                left++;
            else if(nums[right]>target)
                right --;
            else 
                break;
        }
        return temp;
    }
}