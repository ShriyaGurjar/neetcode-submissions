class Solution {
    public Map<Integer, Integer> shortestPath(int n, List<List<Integer>> edges, int src) {

        List<int[]> graph[]=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        for(List<Integer> edge:edges){
            int u=edge.get(0);
            int v=edge.get(1);
            int wt=edge.get(2);
            graph[u].add(new int[]{v,wt});
        }
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->Integer.compare(a[1],b[1]));
         
        
        pq.add(new int[]{src,0});
        int dis[]=new int[n];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[src]=0;


        while(!pq.isEmpty()){
            int curr[]=pq.poll();
            
           int u=curr[0];
           int currDist = curr[1];

if (currDist > dis[u]) {
    continue;
}
           for(int edge[]:graph[u]){
               int v=edge[0];
               int wt=edge[1];

               if(dis[u] != Integer.MAX_VALUE && dis[u]+wt<dis[v]){
                dis[v]=dis[u]+wt;
                pq.add(new int[] {v,dis[v]});
               }
           }

        }
       Map<Integer, Integer> map = new HashMap<>();

for (int i = 0; i < n; i++) {
    if (dis[i] == Integer.MAX_VALUE) {
        map.put(i, -1);
    } else {
        map.put(i, dis[i]);
    }
}

        return map;
    }  
}
