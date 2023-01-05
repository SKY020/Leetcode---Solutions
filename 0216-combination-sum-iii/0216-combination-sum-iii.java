class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        LinkedList<Integer> comb = new LinkedList<>();
        this.backtrack(n,k, list, comb, 0);
        return list;
    }
    protected void backtrack(int remain, int k, List<List<Integer>> ans, LinkedList<Integer> comb, int next_start){
        if(remain == 0 && comb.size() == k){
            ans.add(new ArrayList<>(comb));
            return;
        }
        else if(remain < 0)
            return;
        for(int i = next_start; i < 9; i++){
            comb.add(i + 1);
            this.backtrack(remain - i -1, k, ans, comb, i+1);
            comb.removeLast();
        }
    }
}