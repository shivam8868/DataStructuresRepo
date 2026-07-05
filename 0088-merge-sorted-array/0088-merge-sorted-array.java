class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // brute force approach 
        int i=0;
        int j=0;
        int k=0;
        int[] temp=new int[m];
        while(k<m) {
            temp[k]=nums1[k++];
        }
        k=0;
        // now mearge sort the two arrays 
        while(k<m && j<n) {
            if(temp[k]<=nums2[j]) {
                nums1[i++]=temp[k++];

            }
            else {
                nums1[i++]=nums2[j++];
            }
        }
        while(k<m)  nums1[i++]=temp[k++];
        while(j<n) nums1[i++]=nums2[j++];

    }
}