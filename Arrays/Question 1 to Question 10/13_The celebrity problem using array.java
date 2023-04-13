class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int arr[][], int n)
    {
    	// code here 
    	int c=0;
    	for(int i=1;i<n;i++){
    	    if(arr[c][i]==1){
    	        c=i;
    	    }
    	}
    	for(int i=0;i<n;i++){
    	    if(i!=c && arr[i][c]==0 || arr[c][i]==1) return -1;
    	}
    	return c;
    	
    }
}
