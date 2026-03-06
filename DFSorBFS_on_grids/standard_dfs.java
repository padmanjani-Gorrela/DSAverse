/*
This is a standard template for DFS to reuse in almost every problem where this traversal technique is required/\.
*/

class Solution{
  public ArrayList<Integer> dfsoFGraph(int v,ArrayList<ArrayList<Integer>> adj){
    boolean vis[] = new boolean[v];
    vis[0] = true;
    ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
    dfs(0,vis,adj,ls);
    return ls;
  }
  public static void dfs(int node, boolean[] vis,ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls){
    vis[node]= true;
    for(int nei:adj.get(node)){
      if(!vis[nei]){
        dfs(nei, vis, adj,ls);
      }
    }
}
