class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m=img.length;
        int n=img[0].length;
        int mat[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=img[i][j];

            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int sum=mat[i][j];
                int count=1;
                if((j-1)>=0){
                    sum+=mat[i][j-1];
                    count++;

                }
                if((j+1)<n){
                    sum+=mat[i][j+1];
                    count++;

                }
                if((i-1)>=0){
                    sum+=mat[i-1][j];
                    count++;
                }
                if((i+1)<m){
                    sum+=mat[i+1][j];
                    count++;
                }
                if((i-1)>=0 && (j-1)>=0){
                    sum+=mat[i-1][j-1];
                    count++;

                }
                if((i-1)>=0 && (j+1)<n){
                    sum+=mat[i-1][j+1];
                    count++;
                }
                if((i+1)<m && (j-1)>=0){
                    sum+=mat[i+1][j-1];
                    count++;
                }
                if((i+1)<m && (j+1)<n){
                    sum+=mat[i+1][j+1];
                    count++;
                }
                sum=sum/count;
                img[i][j]=(int)Math.floor(sum);
            }
        }
        return img;
    }
}