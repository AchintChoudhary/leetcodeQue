class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> hm=new HashMap<>();

for(int i=0;i<s.length();i++){
    char ch=s.charAt(i);
    if(ch=='('){
        st.push(i);
    }else if(ch==')'){
        hm.put(st.peek(),i);
        hm.put(i,st.peek());
        st.pop();
    }else{
        continue;
    }
}

StringBuilder result=new StringBuilder("");
int flag=1;

for(int j=0;j<s.length();j+=flag){
    char ch=s.charAt(j);
    if(ch=='(' || ch==')'){
        j=hm.get(j);
        flag=-flag;
    }else{
        result.append(ch);
    }
}

return result.toString();




    }
}