class Solution
{
    //Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        if(V==0)
            return false;
        
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(dfs(adj,i,-1,visited))
                    return true;
            }
        }
        return false;
    }
    boolean dfs(ArrayList<ArrayList<Integer>> adj,int at,int parent,boolean[] visited){
        visited[at]=true;
        ArrayList<Integer> ls=adj.get(at);
        for(Integer i:ls){
            if(visited[i]==false){          // If an adjacent is not
                                            // visited, then recur for that
                                            // adjacent
                if(dfs(adj,i,at,visited))
                    return true;
            }
            else if(i!=parent){   // If an adjacent is visited
            // and not parent of current
            // vertex, then there is a cycle.
                return true;
            }
        }
        return false;
    }
}
