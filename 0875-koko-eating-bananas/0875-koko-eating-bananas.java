class Solution {
    boolean canFinish(int[] piles,int h,int speed) {
        long hour=0;
        for(int banana:piles) {
            // tradationaly it was like hour+=banana/speed but we want the ceil of it this is like a trick 
            hour+=(banana+speed-1)/speed;
        }
        if(hour<=h) {
            return true;
        }
        return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int banana:piles) {
            high=Math.max(banana,high);
        }
        // int ans=high;
        while(low<=high) {
            int mid=low+(high-low)/2;
            if(canFinish(piles,h,mid)) {
                // ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return low;
}
    
}