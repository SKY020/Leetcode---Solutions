class Solution {
    public int[] shortestToChar(String s, char c) {
     int n = s.length();
        int[] out_arr = new int[n];
        int c_pos = -n;
        for(int i = 0;i<n; i++){
            if(s.charAt(i)==c)
                c_pos = i;
            out_arr[i] = i - c_pos;
        }
            
            for(int i = n-1; i>=0;i--){
                if(s.charAt(i)==c)
                    c_pos = i;
                out_arr[i] = Math.min(out_arr[i], Math.abs(i - c_pos));
            }
        return out_arr;
}
}
