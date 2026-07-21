class Solution {
    public int subarraySum(int[] nums, int k) {
        
        // brute force approach time limit exceed 
        // time complexity O(N^2)

        // int sum;
        // int count=0;
        // for(int i=0;i<nums.length;i++) {
        //     sum=0;
        //     for(int j=i;j<nums.length;j++) {
        //         sum+=nums[j];
        //         if(sum==k) {
        //             count++;
        //         }
        //     }
        // }
        // return count;

        // needs optimization 
        // using prefix sum pattern concept
        // will use hashmap

                int count=0;
        int sum=0;// or prefixSum=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);// this will store (currentsum,its count)
        for(int i:nums) {
            sum+=i;
            if(map.containsKey(sum-k)) {
                count+=map.get(sum-k);
                
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;

    }
}