class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int a = 0, b = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int x:aliceSizes)
            a+=x;
        for(int x:bobSizes)
            b+=x;
        
        for(int i = aliceSizes.length-1; i >= 0; i--){
            for(int j = bobSizes.length-1; j >= 0; j--){
                int diff = aliceSizes[i] - bobSizes[j];
                
                if(a-diff == b+diff){
                    ans.add(aliceSizes[i]);
                    ans.add(bobSizes[j]);
                    return ans.stream().mapToInt(Integer::intValue).toArray();
                }
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}