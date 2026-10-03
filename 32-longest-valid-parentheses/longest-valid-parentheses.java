class Solution {
    public int longestValidParentheses(String s) {
       int open=0,close=0;
       int result=0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            open++;
        }else{
            close++;
        }

if(open==close){
result=Math.max(result,open+close);
}else if(close>open){
    open=close=0;
}
 } 
open=0;
close=0;
for(int j=s.length()-1;j>=0;j--){
      if(s.charAt(j)=='('){
            open++;
        }else{
            close++;
        }

        if(open==close){
          result=Math.max(result,open+close);  
        }else if(open>close){
open=close=0;
        }
}

return result;
    }
}