class Solution {
    public void reverse(int[] nums,int start,int end) {
        while(start<end) {
            int temp=nums[start];

            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        // code correct hai better to create a funciton instead of writnng code for revverse again and again
        // k=k%nums.length;
        // // reverse the whole array 
        // for(int i=0;i<nums.length/2;i++) {
        //     int t=nums[i];
        //     nums[i]=nums[nums.length-1-i];
        //     nums[nums.length-i-1]=t;
        // }
        // // reverse the array till d places
        // for(int i=0;i<k/2;i++) {
        //     int t=nums[i];
        //     nums[i]=nums[k-i-1];
        //     nums[k-i-1]=t;
        // }
        // // revverse the array from d to end of the array 
        // for(int i=k;i<nums.length;i++) {
        //     int t=nums[i];
        //     nums[i]=nums[nums.length-1];
        //     nums[nums.length-1]=t;
        // }


        k=k%nums.length;
        // reverse the whole array 
        reverse(nums,0,nums.length-1);
        // reverse the first k elemetn
        reverse(nums,0,k-1);
        // reverse the eremainegn n-1 element 
        reverse(nums,k,nums.length-1);

    }
}