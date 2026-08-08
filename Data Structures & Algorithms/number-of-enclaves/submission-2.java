class Solution {
    public int numEnclaves(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        boolean vis[][]=new boolean [grid.length][grid[0].length];
        int land=0;
        int borderLand=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                land+=grid[i][j];
                if(grid[i][j]==1 && !vis[i][j] &&(i==0 || i==rows-1 || j==0 || j==cols-1)){
                      borderLand+=dfs(i,j,grid,vis);
                     
                }
            }
        }
          return land-borderLand;
    }
    public int dfs(int i,int j,int[][]grid,boolean vis[][]){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length ||
        vis[i][j] || grid[i][j]==0){
            return 0;
        }
        vis[i][j]=true;
        
        int up= dfs(i+1,j,grid,vis);
       int down=dfs(i-1,j,grid,vis);
        int right=dfs(i,j+1,grid,vis);
        int  left=dfs(i,j-1,grid,vis);
          
          return up+down+right+left+1;
    }
  
}