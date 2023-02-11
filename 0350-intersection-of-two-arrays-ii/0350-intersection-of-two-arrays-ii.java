class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int n = nums1.length;
        int m = nums2.length;
        int  arr[] = new int[n+m];
        int i=0; int j = 0; int k = 0;
        int v = 0;
        while(i < n && j < m){
            if(nums1[i] > nums2[j])
                j++;
            else if(nums1[i] < nums2[j])
                i++;
            else{
                arr[k++] = nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(arr, 0, k);
    }
}