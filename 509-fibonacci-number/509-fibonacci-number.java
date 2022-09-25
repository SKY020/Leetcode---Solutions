class Solution {
    public int fib(int n) {
//         if(n<2){
//             return n;
//         }
//         return fib(n-1) + fib(n-2);
        
        if(n<=1) return n;
        int min = -1;
        int[] dp = new int[n+1];
        Arrays.fill(dp,min);
        if(dp[n] != -1) return dp[n];
        return dp[n] = fib(n-1) + fib(n-2);
    }
}