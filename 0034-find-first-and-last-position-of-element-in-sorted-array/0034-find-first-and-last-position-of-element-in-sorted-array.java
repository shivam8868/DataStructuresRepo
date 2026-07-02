class Solution {
    int firstOccurance(int[] nums,int target) {
            int low=0;
            int high=nums.length-1;
            int result=-1;
            while(low<=high) {
                int mid=low+(high-low)/2;
                if(nums[mid]==target) {
                    result=mid;
                    high=mid-1;
                }
                else if(target>nums[mid]) {
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }
            return result;
    }
    int lastOccurance(int[] nums,int target) {
        int low=0;
            int high=nums.length-1;
            int result=-1;
            while(low<=high) {
                int mid=low+(high-low)/2;
                if(nums[mid]==target) {
                    result=mid;
                    low=mid+1;
            }
            else if(target<nums[mid]) {
                high=mid-1;
            }
            else {
                low=mid+1;
            }
            }
            return result;
    }

    public int[] searchRange(int[] nums, int target) {
        int first=firstOccurance(nums,target);
        int last=lastOccurance(nums,target);
        return new int[]{first,last};
    }
}