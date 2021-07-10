public class detectCycleDirected {
 
	static boolean DFSRec(ArrayList<ArrayList<Integer>> adj,int s, boolean[] visited, boolean[] recSt) 
	{ 
    	visited[s]=true;
    	recSt[s]=true;
        
        for(int u:adj.get(s)){
            if(visited[u]==false && DFSRec(adj,u,visited,recSt)==true)
                    {return true;}
            else if(recSt[u]==true)
                {return true;}
        }
        recSt[s]=false;
        return false;
	} 
	
	static boolean DFS(ArrayList<ArrayList<Integer>> adj, int V){
	    boolean[] visited=new boolean[V]; 
    	for(int i = 0; i<V; i++) 
    		visited[i] = false;
    		
    	boolean[] recSt=new boolean[V]; 
    	for(int i = 0; i<V; i++) 
    		recSt[i] = false;
    		
        for(int i=0;i<V;i++){
            if(visited[i]==false)
                if(DFSRec(adj,i,visited,recSt)==true)
                    return true;
        }
        return false;
	}
}
