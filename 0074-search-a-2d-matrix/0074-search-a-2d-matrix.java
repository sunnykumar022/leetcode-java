class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top=0;
        int bottom=matrix.length-1;
        while(top<=bottom){
            int middle=top+(bottom-top)/2;
            int left=0;
            int right=matrix[middle].length-1;
            if(matrix[middle][right]<target){
                top=middle+1;
            }else if(target<matrix[middle][left]){
                bottom=middle-1;
            }else{
                while(left<=right){
                    int mid=left+(right-left)/2;
                    if(matrix[middle][mid]==target) return true;
                    else if(matrix[middle][mid]<target){
                        left=mid+1;
                    }else{
                        right=mid-1;
                    }

                }
                return false;
            }
        }
        return false;
    }
}