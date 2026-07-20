class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        int[] list = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // Step 2: sort by frequency and value
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((a, b) -> {
            if (b.getValue().equals(a.getValue())) {
                return b.getKey() - a.getKey(); // larger number first if freq same
            }
            return b.getValue() - a.getValue(); // higher freq first
        });

     // Step 3: pick top k
        for (int i = 0; i < k && i < entries.size(); i++) {
            list[i] = (entries.get(i).getKey());
        }

        return list;
    }
}