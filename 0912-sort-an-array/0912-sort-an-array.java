class Solution {
    public int[] sortArray(int[] nums) {
        mergeSortRecursive(nums, 0, nums.length -1);
        return nums;
    }
    
    public static void mergeSortRecursive(int[] nums, int low, int high){
        if (high - low + 1 <= 1) return;
        int mid = low + (high-low)/2;
        mergeSortRecursive(nums, low, mid);
        mergeSortRecursive(nums, mid+1, high);
        merge(nums, low, mid, high);
    }
    
    public static void merge(int[] nums, int low, int mid, int high){
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        
        while (i <= mid && j <= high){
            temp[k++] = nums[i] < nums[j] ? nums[i++] : nums[j++];
        }
        
        while(i <= mid){
            temp[k++] = nums[i++];
        }
        
        while(j <= high){
            temp[k++] = nums[j++];
        }
        
        for(int x = low, y = 0; x <= high; x++){
            nums[x] = temp[y++];
        }
    }
}