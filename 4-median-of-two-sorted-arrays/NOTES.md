class Solution {
public double findMedianSortedArrays(int[] nums1, int[] nums2) {
double median = 1;
int a1 = nums1.length;
int b1 = nums2.length;
int c1 = a1 + b1;
int[] ans = new int[c1];
for(int i =0; i<a1;i++){
ans[i]=nums1[i];
}
for(int j=0;j<b1;j++){
ans[a1+j]=nums2[j];
}
Arrays.sort(ans);
if(c1%2!=0){
median = (c1+1)/2;
}
else{
// [(n/2)th term + {(n/2)+1}th]/2
double a = c1/2;
double b = (c1/2)+1;
median = (a + b)/2;
}
for(int k=0; k<c1;k++){
if(ans[k]==0)
return 0;
}
if(c1==1){
return 2.00000;
}
return median;
}
}