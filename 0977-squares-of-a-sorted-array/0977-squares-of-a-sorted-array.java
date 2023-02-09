class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[] = new int[nums.length];
        int ans =1;
        for(int i=0; i<nums.length;i++){
            ans = nums[i]*nums[i];
            arr[i] = ans;
        }
        Arrays.sort(arr);
        return arr;
    }
}