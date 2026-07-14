// Last updated: 7/14/2026, 12:14:37 PM
class Solution {
    public boolean dfs(ArrayList<ArrayList<Integer>> adj,boolean[] visit,int s,int d){
        visit[s]=true;
        for(int i=0;i<adj.get(s).size();i++){
            int child=adj.get(s).get(i);
            if(child ==d){
                return true;
            }
            if(!visit[child]){
                //if a sub graph return false (means d is not)
                if(dfs(adj,visit,child,d)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==destination){
            return true;
        }
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        boolean [] visit=new boolean[n];
        return dfs(adj,visit,source,destination);
    }
}