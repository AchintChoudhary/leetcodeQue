class Solution {
    public String removeDuplicateLetters(String s) {
          int[] lastIndex=new int[26];
       boolean visited[]=new boolean[26];
       Stack<Character> st=new Stack<>();
for(int i=0;i<s.length();i++){
lastIndex[s.charAt(i)-'a']=i;
}
for(int i=0;i<s.length();i++){
    char ch=s.charAt(i);
    if(visited[ch-'a']){
        continue;
    }

while(!st.isEmpty() && st.peek()>ch && lastIndex[st.peek()-'a']>i){
    visited[st.peek()-'a']=false;
    st.pop();
}
st.push(ch);
visited[ch-'a']=true;
}

StringBuilder str=new StringBuilder("");

for(char ch : st){
    str.append(ch);
}
return str.toString();        
    }
}