class Solution {
    public int numIslands(char[][] grid) {
           
           int count=0;
        boolean vis[][]=new boolean[grid.length][grid[0].length];
        
        for(int i=0;i<grid.length;i++){
               for(int j=0;j<grid[0].length;j++){
                  if(grid[i][j]=='1' && vis[i][j]==false){
                     dfs(i,j,vis,grid);
                    count++;
                  }
               }
        }
        return count;
    }
    public void dfs(int i,int j,boolean vis[][],char[][]grid){
        if(  i>=grid.length || i<0 || j>=grid[0].length || j<0 || grid[i][j]=='0' || vis[i][j]==true){
            return;
        }
        vis[i][j]=true;

         dfs(i+1,j,vis,grid);
         dfs(i,j-1,vis,grid);
         dfs(i,j+1,vis,grid);
         dfs(i-1,j,vis,grid);
    }
}
