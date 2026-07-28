import java.util.*;
class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)-> b.getValue()-a.getValue());

        // building resulting string 

        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer> entry: list) {
            char c=entry.getKey();
            int count =entry.getValue();
            for(int i=0;i<count;i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}