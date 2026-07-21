class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // code here
        // my approach is very much similiar to the optimal but just i was using the nested 
        // loops 
        // now optimize it the brute force code is not correct the below one but approach is 
        //right 

        // int count=0;
        // int window=Integer.MAX_VALUE;
        // int sum=0;
        // int n=nums.length;
        // for(int i=0;i<n;i++) {
        //     for(int j=i;j<n;j++) {
        //         sum+=nums[j];
        //         if(sum==target) {
        //             window=Math.min(window,j-i+1);
                    
        //         }
        //         else if(sum>target) {
        //             break;
        //         }
        //     }
        // }
        // return window;

        int i=0;
        int j=0;
        int minsize=Integer.MAX_VALUE;
        int sum=0;
        int n=nums.length;
        while(j<n) {
            sum+=nums[j];
            while(sum>=target) {
                minsize=Math.min(minsize,j-i+1);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        return minsize==Integer.MAX_VALUE?0:minsize;

    }
}