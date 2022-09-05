class Solution {
    public int fib(int n) {
        if(n<2){
            return n;
        }
        return fib(n-1) + fib(n-2);
 }
    
    
    // public int fib(int[] memo,int n){
    //     if(memo[n]==0){
    //         if(n<2){
    //             memo[n]=n;
    //         }
    //         else{
    //             int left = fin
    //         }
    //     }
    // }
}