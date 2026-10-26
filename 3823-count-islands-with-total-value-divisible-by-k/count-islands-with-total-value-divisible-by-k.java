class Solution {
private long check(int i, int j, int[][] grid){
if(i>=grid.length || i<0 || j>=grid[0].length || j<0 || grid[i][j]==0){
    return 0;
}

long sum =grid[i][j];

grid[i][j]=0;

sum+=check(i+1,j,grid);
sum+=check(i,j+1,grid);
sum+=check(i-1,j,grid);
sum+=check(i,j-1,grid);
return sum;


}


    public int countIslands(int[][] grid, int k) {
      int count=0;

      for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]>0){
                long sum=check(i,j,grid);
                if(sum%k==0){
                    count++;
                }
            }
        }
      } 
      return count;
    }
}