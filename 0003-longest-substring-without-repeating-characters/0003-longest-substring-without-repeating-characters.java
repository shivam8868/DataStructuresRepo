class Solution {
    public int lengthOfLongestSubstring(String s) {
        // code here
        String str="";
        int left=0;
        int right=0;
        int max=0;
        while(right<s.length()) {
            if(!str.contains(String.valueOf(s.charAt(right)))) {
                str=str.concat(String.valueOf(s.charAt(right)));
                max=Math.max(max,str.length());
                right++;
             }
             else {
                str="";
                left++;
                right=left;
             }
        }
        return max;
    }
}