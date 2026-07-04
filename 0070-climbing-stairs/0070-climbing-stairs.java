class Solution {
    // public int total(int n) {
    //     if(n<=2) return n;
    //     return total(n-1)+total(n-2);
    // }
    // public int climbStairs(int n){
    //      int count=total(n);
    //      return count;
    // }

    public int climbStairs(int n) {
        if(n<=2) return n;
        int a=1;
        int b=2;
        for(int i=3;i<=n;i++) {
            int c=a+b;
            a=b;
            b=c;

        }
        return b;
    }
}