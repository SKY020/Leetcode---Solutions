class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<n; i++){
            if(nums[i]!=0){
                set.add(nums[i]);
            }
        }
       
        
        return set.size();
    }
}