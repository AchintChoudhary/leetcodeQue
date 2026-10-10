class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int[] freq=new int[100001];
     long totalDiff = 0;
    for(int i=0;i<nums1.length;i++){
        int diff=Math.abs(nums1[i]-nums2[i]);
    freq[diff]++;
     totalDiff += diff;
    }

 long k = (long) k1 + k2;
        if (totalDiff <= k) {
            return 0;
        }


        for (int j = 100000; j > 0 && k > 0; j--) {
            if (freq[j] == 0) {
                continue;
            }
long operations = Math.min((long) freq[j], k);
freq[j]-=(int) operations;
        freq[j-1] += (int) operations;
            k-=operations;
        }
    
    long ans = 0;
    for(int z=0;z<freq.length;z++){
ans+= (long) freq[z] * z*z;
    }
    
   return ans; 
    }
}