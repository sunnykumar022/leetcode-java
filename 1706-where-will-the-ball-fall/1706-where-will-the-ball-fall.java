class Solution {
    public int[] findBall(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int ans[]=new int[n];
        for(int ball=0;ball<n;ball++){
            int row=0;
            int col=ball;
            boolean stuck=false;

            while(row<m && col<n){
                if(grid[row][col]>0){  //right
                    if(col==n-1 || grid[row][col+1]==-1){
                        stuck=true;
                        break;
                    }
                    col++;
                }
                else{ //left -1
                    if(col==0 || grid[row][col-1]==1){
                        stuck=true;
                        break;
                    }
                    col--;
                }
                row++;

            }
            if(stuck==true){
                ans[ball]=-1;
                
            }else{
                ans[ball]=col;
            }
        }
        return ans;
    }
}