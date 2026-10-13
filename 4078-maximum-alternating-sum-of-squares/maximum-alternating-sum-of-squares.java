class Solution {
    public long maxAlternatingSum(int[] nums) {
       long[] arr=new long[nums.length];

       for(int i=0;i<nums.length;i++){
        arr[i] =(long) nums[i] * nums[i];
       }
       
       
        Arrays.sort(arr);

        int left= 0;
        int right=arr.length - 1;
        long score= 0;

        while (left < right) {
            score+=(long)  arr[right];
            score-=(long) arr[left];

            left++;
            right--;
        }
         if (left== right) {
            score+=(long) arr[left];
        }

        return score;
    }
}
