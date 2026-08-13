class Solution {
    static int[][]rotate(int[][] mat){
        int ans[][]=new int[mat.length][mat.length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                ans[j][mat.length-i-1]=mat[i][j];
            }
            
        }
        return ans;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        // rotate 3 time 
        //return  ratated == target 
        int n=mat.length;
        
        for(int i=0;i<4;i++){
            boolean same=true;
            mat=rotate(mat);
            for(int k=0;k<n;k++){
                boolean stop=false;
                for(int j=0;j<n;j++){
                    if(mat[k][j]!=target[k][j]){
                        stop=true;
                        break;
                    }
                }
                if(stop){
                    same=false;
                    break;
                }

            }
            if(same) return true;

        }
        return false;
    }
}