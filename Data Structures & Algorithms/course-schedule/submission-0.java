class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph=new ArrayList<>();
        int indegree[]=new int[numCourses];

        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        for(int arr[]:prerequisites){
            int course=arr[0];
            int pre=arr[1];
            
            graph.get(pre).add(course);
            indegree[course]++;
            
         }
         Queue<Integer>q=new LinkedList<>();
         for(int i=0;i<numCourses;i++){
           if( indegree[i]==0)
            q.offer(i);

         }

         while(!q.isEmpty() && numCourses>0){
            int course=q.poll();
            
            for(int nextCourse:graph.get(course)){
                indegree[nextCourse]--;
                if(indegree[nextCourse]==0){
                    q.offer(nextCourse);
                }
              
                
            }
              numCourses--;
         }
         return  numCourses==0?true:false;
    }
}
