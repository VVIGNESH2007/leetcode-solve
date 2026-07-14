// Last updated: 7/14/2026, 12:15:54 PM
class Solution {
    public int[] findOrder(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int[] indeg=new int[V];
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            indeg[edges[i][1]]++;
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        int count=0;
          ArrayList<Integer> res = new ArrayList<>();
        while(!q.isEmpty()){
            int temp=q.poll();
            res.add(temp);
            count++;
            for(int i=0;i<adj.get(temp).size();i++){
                int child=adj.get(temp).get(i);
                indeg[child]--;
                if(indeg[child]==0){
                    q.add(child);
                }
            }
        }
        int k=0;
        if(count==V){
            int mat[]= new int[V];
            for(int i=V-1;i>=0;i--){
                mat[k++]=res.get(i);
            }
            return mat;  
        }
        else{
            return new int[]{};
        }
    }
}