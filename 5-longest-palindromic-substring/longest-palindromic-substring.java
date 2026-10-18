class Solution {
    private Boolean[][] memo;
private boolean check(int start,int end,String s){
if(start>=end){
    return true;
}

if(memo[start][end]!=null){
    return memo[start][end];
}

if(s.charAt(start)==s.charAt(end)){
memo[start][end]=check(start+1,end-1,s);
}else{
  memo[start][end] = false;
}

return memo[start][end];
}

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int maxLength=0;
 int start=-1;
         memo = new Boolean[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
if(check(i,j,s)){
   if(maxLength < ((j-i) +1)){
    maxLength=(j-i)+1;
    start=i;
   }
}
            }
        }

return s.substring(start,start + maxLength);

    }
}