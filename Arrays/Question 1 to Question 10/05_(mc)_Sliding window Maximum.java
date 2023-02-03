class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n-k+1;i++){
            int max=0;
            
            for(int j=0;j<k;j++){
                if(arr[j+i]>max){
                    max=arr[j+i];
                }
            }
            list.add(max);
        }
        return list;
    }
}
