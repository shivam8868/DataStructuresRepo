class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
    // brute force appraoch 
    // time limit exceed need optimization     
    //     int[] array = new int[temperatures.length];
    //  for(int i=0;i<temperatures.length;i++) {
    //     for(int j=i;j<temperatures.length;j++) {
    //         if(temperatures[j]>temperatures[i]) {
    //             array[i]=j-i;
    //             break;
    //         }
    //     }
    //  }
    //  return array;   


    // optimal approach using stack 
    int n=temperatures.length;
    int[] array= new int[n];
    Stack<Integer> stack = new Stack<>();
    Arrays.fill(array,0);
    for(int i=n-1;i>=0;i--) {
        while(!stack.isEmpty() && temperatures[stack.peek()]<=temperatures[i]) {
            stack.pop();
        }
        if(!stack.isEmpty()) {
            array[i]=stack.peek()-i;
        }
        stack.push(i);
    }
        return array;
    }
}