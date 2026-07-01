class Solution {
    public boolean isPalindrome(String s,int i,int j) {
        while(i<j) {
            if(s.charAt(i)!=s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        // Code here
        int count=0;
        for(int i=0;i<s.length();i++) {
            for(int j=i;j<s.length();j++) {
                if(isPalindrome(s,i,j)) {
                    count+=1;
                }
            }
        }
        return count;
    }
} 