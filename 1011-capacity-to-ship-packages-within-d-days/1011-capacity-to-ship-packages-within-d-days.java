class Solution {
    boolean isPossible(int[] arr,int d,int mid) {
        int days=1;
        int Totalweight=0;
        for(int weight:arr) {
            if(Totalweight+weight>mid) {
                days++;
                Totalweight=weight;
                if(days>d) return false;
            }
            else {
                Totalweight+=weight;
            }
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int weight:weights) {
            low=Math.max(low,weight);
            high+=weight;
        }
        while(low<=high) {
            int mid=low+(high-low)/2;
            if(isPossible(weights,days,mid)) {
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return low;
    }
}