class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea=0;
        boolean vis[][]=new boolean [grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1 && vis[i][j]==false){
                    int area=dfs(i,j,vis,grid);
                    maxArea=Math.max(maxArea,area);
                }
            }
        }
        return maxArea;
    }

    public int dfs(int i,int j,boolean vis[][],int grid[][]){
        if(i>=grid.length || i<0 ||
           j>=grid[0].length || j<0 ||
           grid[i][j]==0 ||
           vis[i][j]==true){
            return 0;
        }
        vis[i][j]=true;
        
        int up=dfs(i+1,j,vis,grid);
        int down=dfs(i-1,j,vis,grid);
        int right=dfs(i,j-1,vis,grid);
        int left=dfs(i,j+1,vis,grid);
        
        return up+down+right+left+1;
    }

    
}
