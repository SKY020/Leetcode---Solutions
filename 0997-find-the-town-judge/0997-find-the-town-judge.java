// class Solution {
//     public int findJudge(int n, int[][] trust) {
//         if(trust.length==0) return 1;
//         HashSet<Integer> hs = new HashSet<>();
//         HashMap<Integer, Integer> hm = new HashMap<>();
//         for(int i=0; i < trust.length; i++){
//             hs.add(trust[i][0]);
            
//             int key = trust[i][1];
//             if(hm.containsKey(key)){
//                 hm.put(key, hm.get(key) + 1);
//             }
//             else{
//                 hm.put(key,1);
//             }
//         }
        
//         for(Integer key : hm.keySet()){
//             if(hm.get(key) == n-1 && hs.contains(key) == false)
//                 return key;
//         }
//         return -1;
//     }
// }



class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1 && trust.length == 0) return 1;
        int [] count = new int[n+1];
        for(int i = 0;i<trust.length;i++){
            
            count[trust[i][0]]--;
            
            count[trust[i][1]]++;
        }

       for(int i = 0;i<count.length;i++){
           if(count[i] ==n-1)  return i;
       }
        return -1;
    }
}