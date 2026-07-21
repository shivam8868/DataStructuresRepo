class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        //code using a simple for loop
        // time complexity T(n)=O(N),
        // space complexity SC=O(1)
        // easy question
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==1) {
                count+=1;
                if(count>max) {
                    max=count;
                }
            }
            else {
                count=0;
            }
        }
        return max;
    }
}