class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1); // default -1
        Stack<Integer> st = new Stack<>();

        // Traverse array twice
        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];
            while (!st.isEmpty() && nums[st.peek()] < num) {
                res[st.pop()] = num;
            }
            if (i < n) {
                st.push(i); // only push first pass indices
            }
        }
        return res;
    }
}