class Solution {
    public int majorityElement(int[] nums) {
        // brute force appraoch 
        // nested loops 
        // for(int i=0;i<nums.length;i++) {
        //     int count=0;
        //     for(int j=0;j<nums.length;j++) {
        //         if(nums[i]==nums[j]) {
        //             count++;
        //         }
        //         if(count>nums.length/2) return nums[j];
        //     }
        // }
        // return -1;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums) {
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>nums.length/2)  return num;
        }
        return -1;
    }
}