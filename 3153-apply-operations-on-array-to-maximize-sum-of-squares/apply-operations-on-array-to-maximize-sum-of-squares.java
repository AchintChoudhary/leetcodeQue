class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int[] freq = new int[32];
long MOD = 1_000_000_007L;
for (int x : nums) {
            for (int b = 0; b < 32; b++) {
                if ((x & (1 << b)) != 0) {
                    freq[b]++;
                }
            }
        }

long curr=0;
long result=0;
while(k-- > 0){
    curr = 0;
    for(int b=0;b<32;b++){
        if(freq[b]>0){
            freq[b]--;
            curr|=(1L<<b);
        }
    }
    
 result = (result + curr * curr) % MOD;

    }

return (int)result;

    }
}