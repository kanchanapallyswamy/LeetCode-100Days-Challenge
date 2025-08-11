import java.util.*;

class Solution {
    public int evalRPN(String[] t) {
        Stack<Integer> st = new Stack<>();
        for (String i : t) {
            if (i.equals("+")) {
                int right = Integer.valueOf(st.pop());
                int left = Integer.valueOf(st.pop());
                int value = left + right;
                st.push(value);
            } else if (i.equals("-")) {
                int right = Integer.valueOf(st.pop());
                int left = Integer.valueOf(st.pop());
                int value = left - right;
                st.push(value);
            } else if (i.equals("*")) {
                int right = Integer.valueOf(st.pop());
                int left = Integer.valueOf(st.pop());
                int value = left * right;
                st.push(value);
            } else if (i.equals("/")) {
                int right = Integer.valueOf(st.pop());
                int left = Integer.valueOf(st.pop());
                int value = left / right;
                st.push(value);
            } else
                st.push(Integer.valueOf(i));
        }

        return st.peek();
    }
}
