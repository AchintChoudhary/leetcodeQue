class MinStack {
    Stack<Long> st = new Stack<>();
    long minVal;

    public MinStack() {
    }

    public void push(int value) {
        long val = value;
if (st.isEmpty()) {
            st.push(val);
            minVal = val;
            return;
        }
if (val < minVal) {
            st.push(2 * val - minVal);
            minVal = val;
        }else {
            st.push(val);
        }
    }

    public void pop() {
        long top = st.peek();
if (top < minVal) {
            minVal = 2 * minVal - top;
        }
 st.pop();
    }

    public int top() {
        long top = st.peek();
if (top < minVal) {
            return (int) minVal;
        }
return (int) top;
    }

    public int getMin() {
        return (int) minVal;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */