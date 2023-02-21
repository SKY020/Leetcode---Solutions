class Solution {
    public boolean isPalindrome(String s) {
    //     int left = 0; int right = s.length() - 1;
    //     while(left <= right){
    //         if(!Character.isLetterOrDigit(s.charAt(left)))
    //             left++;
    //         else if(!Character.isLetterOrDigit(s.charAt(right)))
    //             right--;
    //         else
    //             if(Character.toLowerCase(s.charAt(left))!= 
    //                Character.toLowerCase(s.charAt(right)))
    //                 return false;
    //         left++;
    //         right--;
    //     }
    //     return true;
        
        // Youtube
        
        s = s.toLowerCase();
        StringBuilder b = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                b.append(s.charAt(i));
            }
        }
        int n = b.length() - 1;
        for(int i = 0; i < b.length()/2; i++){
            if(b.charAt(i)!= b.charAt(n-i))
                return false;
        }
        return true;
    }
        
}