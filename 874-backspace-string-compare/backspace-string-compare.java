class Solution {
    public boolean backspaceCompare(String s, String t) {
    Stack<Character> st1=new Stack<>();
    Stack<Character> st2=new Stack<>();
    for(int i=0;i<s.length();i++){
if(s.charAt(i)=='#'){
    if(!st1.isEmpty()){
        st1.pop();
    }
}else{
    st1.push(s.charAt(i));
}
  }

 for(int j=0;j<t.length();j++){
if(t.charAt(j)=='#'){
    if(!st2.isEmpty()){
        st2.pop();
    }
}else{
    st2.push(t.charAt(j));
}
    }

return st1.equals(st2);
    }
}