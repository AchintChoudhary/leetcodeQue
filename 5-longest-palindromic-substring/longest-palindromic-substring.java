class Solution {
private boolean check(int start,int end,String s){
while(start<=end){
    if(s.charAt(start)!=s.charAt(end)){
        return false;
    }
end--;
start++;
}
return true;
}

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int maxLength=0;
 int start=-1;
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