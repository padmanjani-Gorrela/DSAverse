/*
Given an undirected graph with V vertices. Two vertices u and v belong to a single province if there is a path from u to v or v to u. Find the number of provinces. The graph is given as an n x n matrix adj where adj[i][j] = 1 if the ith city and the jth city are directly connected, and adj[i][j] = 0 otherwise.

A province is a group of directly or indirectly connected cities and no other cities outside of the group.

Input: adj=[ [1, 0, 0, 1], [0, 1, 1, 0], [0, 1, 1, 0], [1, 0, 0, 1] ]
Output: 2
Explanation:In this graph, there are two provinces: [1, 4] and [2, 3]. City 1 and city 4 have a path between them, and city 2 and city 3 also have a path between them. There is no path between any city in province 1 and any city in province 2.
*/

// User function Template for Java

class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int v) {
        int cnt = 0;
        ArrayList<ArrayList<Integer>> adjl = new ArrayList<>();
        for(int i = 0; i < v; i++){
            adjl.add(new ArrayList<>());
        }
        for(int i = 0; i < v;i++){
            for(int j = 0; j < v;j++){
                if(adj.get(i).get(j) == 1 && i != j){
                    adjl.get(i).add(j);
                    adjl.get(j).add(i);
                }
            }
        }
        int[] vis = new int[v];
        for(int i = 0; i < v;i++){
            if(vis[i] == 0){
                cnt++;
                dfs(i, adjl,vis);
            }
        }
        return cnt;
    }
    public static void dfs(int node,ArrayList<ArrayList<Integer>> adj,int vis[]){
        vis[node] = 1;
        for(int nei : adj.get(node)){
            if(vis[nei] == 0) dfs(nei, adj, vis);
        }
    }
}
