class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
           sum+=arr[i];
           if(sum==0){
              max=i+1;
           }
           if(!map.containsKey(sum)){
               map.put(sum,i);
           }
           else{
               max=Math.max(max,i-map.get(sum));
           }
        }
        return max;
    }
}

// Naive approch
//Time Complexity: O(N^2) as we have two loops for traversal

//Space Complexity : O(1) as we aren’t using any extra space.

public class Solution {
static int solve(int[] a){
	int  max = 0;
	for(int i = 0; i < a.length; ++i){
		int sum = 0;
		for(int j = i; j < a.length; ++j){
			sum += a[j];
			if(sum == 0){
				max = Math.max(max, j-i+1);
			}
		}
	}
	return max;
   }
