class Solution {
    Set<String> list=new HashSet<>();
    int maxLength=0;

private void solve(int idx,String curr,int count,String s){
    if(count<0){
        return ;
    }
    if(idx==s.length()){
        if(count==0){
            if(curr.length()>maxLength){
                maxLength=curr.length();
                list.clear();
                list.add(curr);
            }else if(curr.length()==maxLength){
                 list.add(curr);
            }
        }
        return;
    }

if(s.charAt(idx)!='(' && s.charAt(idx)!=')'){
    curr=curr+s.charAt(idx);

    solve(idx+1,curr,count,s);
curr=curr.substring(0,curr.length()-1);
return ;
}

curr=curr+s.charAt(idx);
solve(idx+1,curr,count+(s.charAt(idx)=='('?1:-1),s);

curr=curr.substring(0,curr.length()-1);
solve(idx+1,curr,count,s);
}


    public List<String> removeInvalidParentheses(String s) {
        solve(0,"",0,s);
     return new ArrayList<>(list);
    }
}