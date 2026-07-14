// Last updated: 7/14/2026, 12:14:40 PM
class Solution {
    public void dfs(int p,ArrayList<ArrayList<Integer>> adj,  boolean[] vist){
        int temp=p;
        vist[temp]=true;
        for(int i=0;i<adj.get(temp).size();i++){
            int ch=adj.get(temp).get(i);
            if(!vist[ch]){
                vist[ch]=true;
                dfs(ch,adj,vist);
            }
        }
    }
    public int makeConnected(int v, int[][] edges) {
         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        int totalEdge=edges.length;
        boolean[] vist = new  boolean[v];
        int components=0;
        for(int i=0;i<v;i++){
            if(!vist[i]){
                components++;
                dfs(i,adj,vist);

            }
        }
        if(totalEdge>=v-1){
            return components-1;
        }
        else{
            return -1;
        }
 
        
    }
}