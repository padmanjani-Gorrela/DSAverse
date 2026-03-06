/*
This is the standard template that we use in almost every problem for bfs.
*/
class SOlution{
  public ArrayList<Integer> bfsofGraph(int v, List<List<Integer>> adj){
    ArrayList<Integer> bfs = new ArrayList<>();
    boolean[] vis = new boolean[v];
    Queue<Integer> q = new LinkedList<>();
    q.offer(0);
    vis[0] = true;
    while(!q.isEmpty()){
      int node = q.poll();
      bfs.add(node);
      for(int x : adj.get(node)){
       if(vis[x] == false){
         vis[x] = true;
         q.offer(x);
       }
    }
    return bfs;
  }
}
