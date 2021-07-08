import java.util.*;

class bfs {
	static void BFS(ArrayList<ArrayList<Integer>> adj,int V,int s) 
	{ 
		boolean[] visited=new boolean[V]; 
    	Queue<Integer> q=new LinkedList<>();
    	visited[s] = true; 
    	q.add(s); 
    
    	while(q.isEmpty()==false) 
    	{ 
    		int u = q.poll(); 
    		System.out.print(u + " "); 
    		 
    		for(int v:adj.get(u)){
    		    if(visited[v]==false){
    		        visited[v]=true;
    		        q.add(v);
    		    }
    		} 
    	} 
	} 
}