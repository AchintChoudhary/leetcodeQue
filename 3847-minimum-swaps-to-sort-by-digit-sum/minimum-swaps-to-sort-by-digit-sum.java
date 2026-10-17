class Solution {
   private static int getDigitSum(int num) {
        int sum = 0;
        while (num>0) {
            sum+=num % 10;
            num/=10;
        }
        return sum;
    }

    public int minSwaps(int[] nums) {
        int n = nums.length;
        Integer[] boxed = new Integer[n];
        for (int i = 0; i < n; i++) {
            boxed[i] = nums[i];
        }

         HashMap<Integer,Integer> hm=new HashMap<>();
         for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
         }

 Arrays.sort(boxed, (a, b) -> {
    int sumCompare = Integer.compare(getDigitSum(a), getDigitSum(b));
    if (sumCompare != 0) {
        return sumCompare;
    }
    return Integer.compare(a, b);
});

int swap=0;
for(int i=0;i<nums.length;i++){

int expected=boxed[i];
int curr=nums[i];

if(expected==curr){
    continue;
}
int idx=hm.get(expected);
nums[i]=expected;
nums[idx]=curr;
hm.put(curr,idx );
hm.put(nums[i], i);
 swap++;
}
return swap;
    }
    
}