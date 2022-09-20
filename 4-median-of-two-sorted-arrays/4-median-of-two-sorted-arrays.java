class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        float[] ans = new float[nums1.length+nums2.length];
        int i = 0;
        for(float n:nums1){
            ans[i]=n;
            i++;
        }
        for(float n1:nums2){
            ans[i]=n1;
            i++;
        }
        Arrays.sort(ans);
        if(ans.length%2==0){
            int mid = ans.length/2;
            float total = (ans[mid-1] + ans[mid])/2;
            return total;
        }
        else{
            // [(n/2)th term + {(n/2)+1}th]/2
            int mid = ans.length/2;
            float total = ans[mid];
            return total;
            
        }
    }
}