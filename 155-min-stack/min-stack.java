class pair{
    int value;
    int minVal;

    pair(int value,int minVal){
        this.value=value;
        this.minVal=minVal;
    }
}

class MinStack {
Stack<pair> st=new Stack<>(); 
    public MinStack() {
        
    }
    
    public void push(int value) {
      if(st.isEmpty()){
        st.push(new pair(value,value));
      }else{
        int minVal=st.peek().minVal;
        if(minVal>value){
minVal=value;
        }
        st.push(new pair(value,minVal));
      }
    }
    
    public void pop() {
      st.pop();  
    }
    
    public int top() {
      return  st.peek().value;
    }
    
    public int getMin() {
      return  st.peek().minVal;
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