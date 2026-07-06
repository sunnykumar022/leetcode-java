class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n=grid.length;
        int rowMax[]=new int[n];
        int colMax[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rowMax[i]=Math.max(rowMax[i],grid[i][j]);
                colMax[i]=Math.max(colMax[i],grid[j][i]);
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum+=Math.min(rowMax[j],colMax[i])-grid[i][j];
            }
        }
        return sum;
        
    }
}