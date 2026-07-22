class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // // will use hashmmap and sliding winnodow
        // if(s1.length()>s2.length()) return false;
        // // these two arrays will store string to there index wise 
        // int[] count1=new int[26];
        // int[] count2=new int[26];
        // // frequency of s1
        // for(char c:s1.toCharArray()) {
        //     count1[c-'a']++;
        // }
        // // first window in s2
        // for(int i=0;i<s1.length();i++) {
        //     count2[s2.charAt(i)-'a']++;
        // }
        // if(Arrays.equals(count1,count2)) return true;

        // // now slide the window in s2
        // for(int i=s1.length();i<s2.length();i++) {
        //     count2[s2.charAt(i)-'a']++;// ad the new char
        //     // count2[s2.charAt(i-s1.length())-'a'];// remoove the older char
        //     if(Arrays.equals(count1,count2)) return true;
        // }
        // return false;

        if (s1.length() > s2.length())
            return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // frequency of s1
        for (char c : s1.toCharArray()) {
            count1[c - 'a']++;
        }

        // first window in s2
        for (int i = 0; i < s1.length(); i++) {
            count2[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(count1, count2))
            return true;

        // slide window
        for (int i = s1.length(); i < s2.length(); i++) {
            count2[s2.charAt(i) - 'a']++; // add new char
            count2[s2.charAt(i - s1.length()) - 'a']--; // remove old char

            if (Arrays.equals(count1, count2))
                return true;
        }

        return false;
    }
}