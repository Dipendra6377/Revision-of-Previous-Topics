class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
        if(n>m){
            return kthElement(arr2,arr1,m,n,k);                         // for l and h to be taken corrected for edge cases
        }
        
        int l=Math.max(0,k-m);  // this step is important                           for edge cases :      // arr1 [7 12 14 15]  arr2  [1 2 3 4 9 11]   k=7  u cannot take low as 0 bcoz as in next array there are 6 element but u want 7th element so partition window is of size 6 will be smaller 
        int h=Math.min(k,n);                                                                              // so take low as 1 total elemnt arr1 min elemnt is 1 ans max can be 4 from arr1 &&&&& min of 3 element and 6 element from arr2 so that total left side window will be of 7 size and max will be answer
        
        while(l<=h){
            int mid1 = l+(h-l)/2;
            int mid2 = k-mid1;
            
            int l1=mid1==0?Integer.MIN_VALUE : arr1[mid1-1];
            int l2=mid2==0?Integer.MIN_VALUE : arr2[mid2-1];
            int r1=mid1==n?Integer.MAX_VALUE : arr1[mid1];
            int r2=mid2==m?Integer.MAX_VALUE : arr2[mid2];
            
            if(l1<=r2 && l2<=r1){
                return Math.max(l1,l2);
            }
            
            else if (l1>r2){
                h=mid1-1;
            }
            else{
                l=mid1+1;
            }
        }
        return 1;
    }
}


