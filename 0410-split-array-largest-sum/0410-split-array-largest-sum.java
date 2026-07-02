class Solution {
    boolean isPossible(int[] nums,int k,int mid) {
        int student =1;
        int pages=0;
        for(int book:nums) {
            if(pages+book>mid) {
                student++;
                pages=book;
                if(student>k) return false;
            }
            else {
                pages+=book;
            }
        }
            return true;
    }
    public int splitArray(int[] nums, int k) {
        int low=0;
        int high=0;
        int result=-1;
        for(int number:nums) {
            low=Math.max(low,number);
            high+=number;
        }
        while(low<=high) {
            int mid=low+(high-low)/2;
            if(isPossible(nums,k,mid)) {
                result=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return result;
    }
}