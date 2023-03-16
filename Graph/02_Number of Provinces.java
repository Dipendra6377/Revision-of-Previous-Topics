class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        ArrayList<ArrayList<Integer>> adj =new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }    
        }
        int[] vis=new int[n];
        int cnt=0;

        for(int i=0;i<n;i++){
            if(vis[i]==0){
                cnt++;
                dfs(adj,vis,i);
            }
        }
        return cnt;
    }

    public void dfs(ArrayList<ArrayList<Integer>> adj,int[] vis,int node){
        vis[node]=1;

        for(int adjnode :adj.get(node)){
            if(vis[adjnode]==0){
                dfs(adj,vis,adjnode);
            }
        }
    }
}
