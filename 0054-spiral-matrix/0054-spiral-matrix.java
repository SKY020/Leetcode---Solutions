class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<Integer>();
        if(matrix.length == 0) return spiral;
        int m = matrix.length; int n = matrix[0].length; int i = 0; int j = 0; int k;
        while(i < m && j < n){
            for(k = j; k < n; k++){
                spiral.add(matrix[i][k]);
            }
            i++;
            for(k = i; k < m; k++){
                spiral.add(matrix[k][n-1]);
            }
            n--;
            if(i < m){
            for(k = n-1; k >= j; --k){
                spiral.add(matrix[m-1][k]);
            }
            m--;
            }
            if(j < n){
                for(k = m-1; k >= i; --k){
                spiral.add(matrix[k][j]);
            }
                j++;
            }
        }
        return spiral;
    }
}