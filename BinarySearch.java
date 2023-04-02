//simple search
class BinarySearch {
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }

        }
        return -1;
    }
}

// alternate method
// simple search
/*
 * class Solution {
 * public int search(int[] nums, int target) {
 * for(int i=0;i<nums.length;i++){
 * if(nums[i]==target){
 * return i;
 * }
 * 
 * }
 * return -1;
 * }
 * }
 */
// alternate method
/*
 * class Solution{
 * public int search(int[] nums, int target){
 * int low =0, high=nums.length-1, mid =0;
 * for(int i=low;i<high;i++){
 * mid=low+high/2;
 * 
 * if(mid==target){
 * return i;
 * 
 * }
 * if(mid<target){
 * high=mid-1;
 * }
 * else
 * low= mid-1;
 * 
 * }
 * return -1;
 * }
 * }
 */
class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= target)
                r = mid;
            else
                l = mid + 1;
        }

        if (nums[l] != target)
            return -1;
        return l;
    }
}