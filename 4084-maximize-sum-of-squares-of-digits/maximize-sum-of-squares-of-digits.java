class Solution {
    public String maxSumOfSquares(int num, int sum) {
      if(sum>num*9){
        return "";
      }
      
       int nine=sum/9;
       int remain=sum%9;

       StringBuilder result=new StringBuilder();
       result.repeat('9', nine); 

if(remain>0){
    result.append((char) (remain + '0'));  //convert int to character
}

result.repeat('0', num - result.length());

return result.toString();
    }
}