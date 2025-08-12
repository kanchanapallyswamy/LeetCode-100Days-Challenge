class MinStack {
    Stack<Integer> minst;
    Stack<Integer> st;

    public MinStack() {
        minst = new Stack<>();
        st = new Stack<>();
    }

    public void push(int val) {
        st.push(val);
        if (minst.isEmpty())
            minst.add(val);
        else {
            int peek = minst.peek();
            if (val <= peek)
                minst.add(val);
            else
                minst.add(minst.peek());
        }
        return;
    }

    public void pop() {
        if (!st.isEmpty())
            st.pop();
        minst.pop();
    }

    public int top() {
        if (!st.isEmpty())
            return st.peek();
        return -1;
    }

    public int getMin() {
        if (!st.isEmpty())
            return minst.peek();
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
