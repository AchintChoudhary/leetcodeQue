class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
    ArrayList<Integer> ls=new ArrayList<>();
int small=0;
int equal=0;
for(int num : nums){
    if(num< target){
small++;
    }else if(target==num){
        equal++;
    }
}

for(int i=small;i<equal+small;i++){
    ls.add(i);
}

return ls;


    }
}