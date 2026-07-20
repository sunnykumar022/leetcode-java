class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int total=m*n;

        //make 1 d array
        List<Integer>flat=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                flat.add(grid[i][j]);
            }
        }
        k=k%total;
        List<Integer>shifted=new ArrayList<>();
        for(int i=0;i<total;i++){
            shifted.add(flat.get((i-k+total)%total));
        }
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer>row=new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(shifted.get(i*n+j));


            }
            result.add(row);
        }
        return result;
    }
}