class Solution {
    public int[] nextGreaterElements(int[] nums) {
      int arr[]=new int[nums.length];
      Stack<Integer> st=new Stack<>();
      int size=(nums.length *2)-1;
        for(int i=size;i>=0;i--){
while(!st.isEmpty() && st.peek()<=nums[i%nums.length]){
    st.pop();
}
if(st.isEmpty()){
    arr[i%nums.length]=-1;
}else{
    arr[i%nums.length]=st.peek();
}
st.push(nums[i % nums.length]);
        }
return arr;


    }
}