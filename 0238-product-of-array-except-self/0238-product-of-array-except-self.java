class Solution {
    public int[] productExceptSelf(int[] arr) {
        int temp = 1;
        int[] result = new int[arr.length];
        for(int i=0; i < arr.length; i++){
            result[i] = temp;
            temp = temp * arr[i];
        }
        temp = 1;
        for(int i= arr.length-1; i >= 0; i--){
            result[i] = result[i]*temp;
            temp = temp*arr[i];
        }
        return result;
    }
}