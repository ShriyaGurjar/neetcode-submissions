class Solution {
   
    public int networkDelayTime(int[][] times, int n, int k) {
        List<int[]> graph[]=new ArrayList[n];

           for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
           }
        for(int i=0;i<times.length;i++){
            int time[]=times[i];
            int u=time[0]-1;
            int v=time[1]-1;
            int dis=time[2];
            graph[u].add(new int[]{v,dis});
        }
    PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
    
    int dis[]=new int[n];
    
    for(int i=0;i<n;i++){
        dis[i]=Integer.MAX_VALUE;
    }
    dis[k-1]=0;
    pq.add(new int[]{k-1,0});
  
      while(!pq.isEmpty()){
            int node[]=pq.poll();
            int u=node[0];
            int weight=node[1];
          for(int edge[]:graph[u]){
            int v=edge[0];
            int dt=edge[1];

            if(dis[v]>dis[u]+dt){
                dis[v]=dis[u]+dt;
                pq.add(new int []{v,dis[v]});
            }
          }

      }

      int answer=0;
      
      for(int i=0;i<n;i++){
        if(dis[i]==Integer.MAX_VALUE){
            return -1;
        }
        answer=Math.max(answer,dis[i]);
      }
      return answer;
    }
   

         
    
}
