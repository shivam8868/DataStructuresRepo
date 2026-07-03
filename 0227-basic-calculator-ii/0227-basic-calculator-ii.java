class Solution {
    public int calculate(String s) {
        Stack<Integer> stack=new Stack<>();
        int num=0;
        char prevsign='+';
        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if(Character.isDigit(c)) {
                num=num*10 + (c-'0');

            }
            if((!Character.isDigit(c) && c!=' ') || i==s.length()-1) {
                if (prevsign == '+') {
                    stack.push(num);
                } else if (prevsign == '-') {
                    stack.push(-num);
                } else if (prevsign == '*') {
                    stack.push(stack.pop() * num);
                } else if (prevsign == '/') {
                    stack.push(stack.pop() / num);
                }
                prevsign = c;
                num = 0;
            }
        }
        int result=0;
        for(int val: stack) {
            result+=val;
        }
        return result;
    }
}