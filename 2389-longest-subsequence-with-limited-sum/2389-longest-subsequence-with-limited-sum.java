class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        // ArrayList<Integer> my = new ArrayList<Integer>();
        int ans[] = new int[queries.length];        
        for(int j = 0; j < queries.length; j++){
            int count=0;
            int sum = 0;

            for(int i = 0; i < nums.length; i++){
                sum = sum + nums[i];
            if(sum <= queries[j]){
                count++;
            }
                ans[j] = count;
        }
            
    }
        
        return ans;
    }
}