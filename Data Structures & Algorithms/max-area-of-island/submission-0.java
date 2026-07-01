class Solution {

    public static int dfs(int [][]grid,int i,int j){
        if(i<0 || j<0 || j==grid[0].length || i==grid.length || grid[i][j]==0){
            return 0;
        }

        int count=1;

        grid[i][j]=0;

        count +=dfs(grid,i+1,j);
        count +=dfs(grid,i-1,j);
        count +=dfs(grid,i,j+1);
        count +=dfs(grid,i,j-1);

return count;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int maxSize=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                   int islandSize= dfs(grid,i,j);
                   if(islandSize>maxSize){
                    maxSize=islandSize;
                   }
                }
            }
        }
        return maxSize;
    }
}
