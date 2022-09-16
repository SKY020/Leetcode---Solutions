class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> visited = new HashSet();
        
        for(char c : s.toCharArray()){
            if(visited.contains(c)){
                return c;
            }
            else
                visited.add(c);
        }
         return ' ';

    }
}