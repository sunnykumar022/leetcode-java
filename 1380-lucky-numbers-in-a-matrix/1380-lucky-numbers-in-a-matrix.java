class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            int min=matrix[i][0];
            int mincol=0;
            for(int j=0;j<n;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    mincol=j;
                }

            }
                boolean flag=true;
                for(int k=0;k<m;k++){
                    if(matrix[k][mincol]>min){
                        flag=false;
                        break;
                        
                    }

                    
                }
                if(flag){
                    list.add(min);
                }
            
        }
        return list;
    }

}