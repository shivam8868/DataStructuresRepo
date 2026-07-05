class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;// this pointer is for nums1
        int j=0; // tis is for nums2
        int k=0; // this is for tmep
        int m=nums1.length;
        int n=nums2.length;
        int[] temp=new int[m+n];
        // lets first sort the array into a new temp aray
        while(i<m && j<n) {
            if(nums1[i]<nums2[j]) {
                temp[k++]=nums1[i++];
            }
            else {
                temp[k++]=nums2[j++];
            }
        }
        while(i<m) temp[k++]=nums1[i++];
        while(j<n) temp[k++]=nums2[j++];
        int total=m+n;
       if(total%2==1) {
        return temp[total/2]; // return the middle elemment becaue of odd element 
       }
       return (temp[total/2-1]+temp[total/2])/2.0;
    }
}