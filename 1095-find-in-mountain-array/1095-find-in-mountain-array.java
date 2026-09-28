/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int length=mountainArr.length()-1;
        int i=0;
        int j=length;
        int pindex=0;
        while (i < j) {
            int mid = i + (j - i) / 2;
            // Compare mid with the next element to see if we are ascending or descending
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                i = mid + 1; // Peak is to the right
            } else {
                j = mid;     // Peak is at mid or to the left
            }
        }
        pindex = i; // i and j converge at the peak
        i=0;
        j=pindex;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }else if(mountainArr.get(mid)>target){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        i=pindex;
        j=length;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }else if(mountainArr.get(mid)>target){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return -1;
    }
}