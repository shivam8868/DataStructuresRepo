class Solution {
    public int hammingWeight(int n) {
        int[] binaryNum=new int[1000];
        // counter to calculate the lenght of the binary array 
        int i=0;
        int oneCounter=0;
        while(n>0) {
            binaryNum[i]=n%2;
            n=n/2;
            i++;
        }
        for(int nums:  binaryNum) {
            if(nums==1) oneCounter++;
        }
        return oneCounter;
    }
}