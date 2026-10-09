class Solution {
    public int minInsertions(String s) {
      int open=0;
      int insertion=0;
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);

if(ch=='('){
    open++;
}else if(ch==')'){
    if(i<s.length()-1 && s.charAt(i+1)==')'){
        i++;
    }else{
        insertion++;
    }

        if(open>0){
            open--;
        }else{
            insertion++;
        }

}


      }  
 
 return insertion + 2*open;
    }
}