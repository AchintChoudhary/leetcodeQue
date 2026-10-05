class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        
   HashMap<String, String> map = new HashMap<>();
StringBuilder temp=new StringBuilder("");
StringBuilder result=new StringBuilder("");
    for (List<String> pair : knowledge) {
        map.put(pair.get(0), pair.get(1));
    }

boolean flag=false;
int i=0;
while(i<s.length()){
     if (s.charAt(i) == '(') {
                flag = true;
                temp.setLength(0);
                i++;

                while (flag) {
                    if (s.charAt(i) == ')') {
                        flag = false;
                    } else {
                        temp.append(s.charAt(i));
                    }
                    i++;
                }

                if (map.containsKey(temp.toString())) {
                    result.append(map.get(temp.toString()));
                } else {
                    result.append('?');
                }

            } else {
                result.append(s.charAt(i));
                i++;
            }

}




return result.toString();

}   
}