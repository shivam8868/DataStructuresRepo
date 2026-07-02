class Solution {
    public int findMin(int[] nums) {
        // int min=nums[0];
        // for(int i=0;i<nums.length;i++) {
        //     min=Math.min(min,nums[i]);
        // }
        // return min;
// the anser will be store where the array in rotated means if left half is sroted then ans  weilll be in right half 
// sso we take the min in teh sorted in any half and checks for the another half and do teh same ultimately  we will have the min value 
// with O(logN)
        int low=0;
        int high=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high) {
            int mid=low+(high-low)/2;
            if(nums[low]<=nums[mid]) {
                ans=Math.min(ans,nums[low]);
                low=mid+1;
            }
            else {
                ans=Math.min(ans,nums[mid]);
                high=mid-1;
            }
        }
        return ans;
    }
}