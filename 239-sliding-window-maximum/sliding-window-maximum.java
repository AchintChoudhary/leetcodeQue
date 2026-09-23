class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new LinkedList<>();
        int result[]=new int[nums.length -k +1];
int index=0;
for(int i=0;i<k;i++){
    while(!dq.isEmpty() && nums[dq.getLast()]<=nums[i]){
        dq.removeLast();
    }
    dq.addLast(i);
}

for(int j=k;j<nums.length;j++){
result[index++]=nums[dq.getFirst()];
while(!dq.isEmpty() && dq.getFirst()<=j-k){
    dq.removeFirst();
}

while(!dq.isEmpty() && nums[dq.getLast()]<=nums[j]){
    dq.removeLast();
}
dq.addLast(j);
}


result[index]=nums[dq.getFirst()];
return result;
    }
}