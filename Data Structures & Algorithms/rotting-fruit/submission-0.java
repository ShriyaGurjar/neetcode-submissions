class Solution {
    public int orangesRotting(int[][] grid) {

         Queue<int[]>q=new LinkedList<>();
          int freshCount=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                
                if(grid[i][j]==2){
                    q.offer(new int [] {i,j});
                }else if(grid[i][j]==1){
                    freshCount++;
                }
            }
        }
        if(freshCount==0){
            return 0;
        }
        
        int minutes=0;
        int directions[][]={{-1,0},{1,0},{0,-1},{0,1}};
        while(!q.isEmpty()  && freshCount>0){
              int k=q.size();

            
             for(int i=0;i<k;i++){

                int arr[]=q.poll();
                int r=arr[0];
                int c=arr[1];


              for(int dir[]:directions){
                int nR=r-dir[0];
                int nC=c-dir[1];
                
                if(nR>=0 && nC>=0 && nR<grid.length && nC<grid[0].length && grid[nR][nC]==1){
                   freshCount--;
                   grid[nR][nC]=2;
                  q.offer(new int[]{nR,nC});
                }
              }
            

             }
             minutes++;

        }
       return freshCount == 0 ? minutes : -1;
        
    }

    
}
