class pair{
    int wt;
    int node;
    
    pair(int wt,int node){
        this.wt=wt;
        this.node=node;
    }
}
class Solution{
	static int spanningTree(int V, int E, int edges[][]){
	    // Code Here. 
	    ArrayList<ArrayList<pair>> adj = new ArrayList<>();
	    
	    for(int i=0;i<V;i++){
	        adj.add(new ArrayList<>());
	    }
	    
	    for(int i=0;i<edges.length;i++){
	        adj.get(edges[i][0]).add(new pair(edges[i][2],edges[i][1]));
	        adj.get(edges[i][1]).add(new pair(edges[i][2],edges[i][0]));
	    }
	    PriorityQueue<pair> pq=new PriorityQueue<>((x,y) -> x.wt-y.wt);
	    int[] vis =new int[V];
	    
	    pq.add(new pair(0,0));
	    int sum=0;
	    while(!pq.isEmpty()){
	        pair temp =pq.peek();
	        int weight = temp.wt;
	        int n =temp.node;
	        pq.remove();
	        
	        if(vis[n]==1){
	            continue;
	        }
	        vis[n]=1;
	        sum+=weight;
	        
	        for(pair adjnode : adj.get(n)){
	            int newwt = adjnode.wt;
	            int newnode =adjnode.node;
	            
	            if(vis[newnode]==0){
	                pq.add(new pair(newwt,newnode));
	            }
	        }
	        
	    }
	    return sum;
	}
}
