class Solution {

    public boolean isCycle(List<Integer> graph[],boolean vis[],boolean path[],int u){
        
        if(path[u]){
            return true;
        }
          if (vis[u]) {
        return false;
    }
         vis[u]=true;
         path[u]=true;

         for(int v:graph[u]){
           
               if( isCycle(graph,vis,path,v)){
                return true;
               };
            
         }
         path[u]=false;
         return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<Integer> graph[]=new ArrayList[numCourses];
         for(int i=0;i<numCourses;i++){
            graph[i]=new ArrayList<>();
         }
        for(int edge[]:prerequisites){
            int v=edge[0];
            int u=edge[1];

            graph[u].add(v);
        }
      boolean vis[]=new boolean[numCourses];
       boolean path[]=new boolean[numCourses];

       for(int i=0;i<numCourses;i++){
        if(!vis[i]){
           if( isCycle(graph,vis,path,i)){
            return false;
           };
        }
       }
       return true;
    }
}
