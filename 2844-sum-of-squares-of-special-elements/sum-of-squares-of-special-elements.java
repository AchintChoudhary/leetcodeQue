class Solution {
    public int sumOfSquares(int[] nums) {
        int total=0;
   for(int i=0;i<nums.length;i++){
if(nums.length % (i+1) == 0){
    total+=nums[i]*nums[i];
}
   }
   return total;
    }
}