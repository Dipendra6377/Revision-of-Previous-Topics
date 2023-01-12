//N = 5
//Arr[] = {5, 1, 2, 3, 4}
//Output: 1

class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        int i=0;
        int j=n-1;
        
        while(i<=j){
            int mid = (i+j)/2;
            int next =(mid+1)%n;
            int prev = (mid+n-1)%n;
            
            if(arr[mid]<arr[next] && arr[mid]<arr[prev]){
                return mid;
            }
            
            else if(arr[mid]<arr[j]){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return 0;
    }
}
