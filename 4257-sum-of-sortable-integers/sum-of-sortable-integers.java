class Solution {
int[] LPS;
private void LPS(int[] pattern ){
int m=pattern.length;
int length=0;
int i=1;
LPS=new int[m];

while(i<m){
    if(pattern[i]==pattern[length]){
        length++;
        LPS[i]=length;
        i++;
    }else{
if(length!=0){
    length=LPS[length-1];
}else{
    LPS[i]=0;
    i++;
}
    }
}

}


private boolean KMP(int[] pattern, int[] arr){
     if (pattern.length == 0) {
            return true;
        }

        LPS(pattern);
int i=0,j=0;
while(i<arr.length){
    if(arr[i]==pattern[j]){
        i++;
        j++;
         if (j == pattern.length) {
                    return true;
                }
    }else{
        if (j != 0) {
                    j = LPS[j - 1];
                } else {
                    i++;
                }
  } 
}
return false;
}

private boolean isRotationPossible(int[] arr1,int[] arr2){
     if (arr1.length != arr2.length) {
            return false;
        }

        if (arr1.length == 0) {
            return true;
        }
    int[] combined=new int[arr1.length*2 -1];

System.arraycopy(arr1,0,combined,0,arr1.length);
System.arraycopy(arr1,0,combined,arr1.length,arr1.length-1);
return KMP(arr2,combined); //(pattern, combined Array)
}

    public int sortableIntegers(int[] nums) {
int[] sorted = nums.clone();
        Arrays.sort(sorted);

int result=0;
for(int k=1;k<=nums.length;k++){
    if(nums.length%k!=0){
 continue;
    }
    boolean valid=true;
for(int start=0;start<nums.length;start+=k){

    int[] arr1 = Arrays.copyOfRange(nums, start, start+k);
    int[] arr2=Arrays.copyOfRange(sorted, start, start+k);
if(!isRotationPossible(arr1,arr2)) //(pattern, sorted array)
{
    valid=false;
break;
}


}

if(valid){
    result+=k;
}

}       
return result; 
    }
}