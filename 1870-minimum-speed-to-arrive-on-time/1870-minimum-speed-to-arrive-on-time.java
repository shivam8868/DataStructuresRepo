class Solution {
    public boolean isPossible(int[] dist, double hour, int speed) {
        double time = 0.0;
        for (int i = 0; i < dist.length; i++) {
            double t = (double) dist[i] / speed;
            if (i != dist.length - 1) {
                time += Math.ceil(t); // wait for next integer hour
            } else {
                time += t; // last train exact fractional time allowed
            }
        }
        return time <= hour;
    }

    public int minSpeedOnTime(int[] dist, double hour) {
        int low = 1, high = 10000000; // given constraint
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(dist, hour, mid)) {
                ans = mid;
                high = mid - 1; // try smaller speed
            } else {
                low = mid + 1; // need bigger speed
            }
        }
        return ans;
    }

}