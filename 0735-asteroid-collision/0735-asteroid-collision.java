class Solution {
    public int[] asteroidCollision(int[] asteroids) {
          Stack<Integer> stack = new Stack<>();
    for (int a : asteroids) {
        boolean alive = true;
        while (alive && !stack.isEmpty() && stack.peek() > 0 && a < 0) {
            if (stack.peek() < -a) {
                stack.pop(); // right asteroid explodes
            } else if (stack.peek() == -a) {
                stack.pop(); // both explode
                alive = false;
            } else {
                alive = false; // current asteroid explodes
            }
        }
        if (alive) {
            stack.push(a);
        }
    }
    // convert stack to array
    int[] res = new int[stack.size()];
    for (int i = 0; i < res.length; i++) {
        res[i] = stack.get(i);
    }
    return res;
    }
}