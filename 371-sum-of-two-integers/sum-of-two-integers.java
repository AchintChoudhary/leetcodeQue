class Solution {
    public int getSum(int a, int b) {
   int sum= a ^b;
   int carry=a & b;
   int actualCarry=carry<<1;

while(carry!=0){
carry=sum & actualCarry;
sum=sum ^ actualCarry;
actualCarry=carry<<1;
}

return sum;
    }
}