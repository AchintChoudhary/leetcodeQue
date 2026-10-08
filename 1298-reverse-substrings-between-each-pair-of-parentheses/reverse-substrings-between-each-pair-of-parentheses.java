class Solution {
   StringBuilder result=new StringBuilder("");
    private void reverse(int start, int end){
        int left=start;
        int right=end;

        while(left<right){
           char temp = result.charAt(left);
            result.setCharAt(left, result.charAt(right));
            result.setCharAt(right, temp);
            left++;
right--;
        }
    }
    public String reverseParentheses(String s) {
        Stack<Integer> st=new Stack<>();
    for(int i=0;i<s.length();i++){
    char ch=s.charAt(i);

if(ch=='('){
   st.push(result.length());
}else if(ch==')'){
 int start= st.pop();
                reverse(start,result.length()-1);
}else{
    result.append(ch);
}

}

return result.toString();
    }
}