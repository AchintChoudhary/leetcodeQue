class Solution {
    public int firstUniqChar(String s) {
int arr[]=new int[26];
Queue<Integer> q=new LinkedList<>();

for(int i=0;i<s.length();i++){
    char ch=s.charAt(i);
q.add(i);

arr[ch-'a']++;

while(!q.isEmpty() && arr[s.charAt(q.peek())-'a']>1){
q.remove();
}
}
if(q.isEmpty()){
    return -1;
}
return q.peek();
    }
}