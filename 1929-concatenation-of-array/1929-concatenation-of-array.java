class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] arr = new int [2*len];
        int i= 0;
        for(int n:nums){
            arr[i] = n;
            i++;
        }
        for(int n:nums){
            arr[i] = n;
            i++;
        }
        return arr;
    }
}