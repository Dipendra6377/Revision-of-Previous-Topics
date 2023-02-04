// can be made into shorter code below
class Solution
{
    public int NthRoot(int n, int m)
    {
        // code here
        int i=0;
        int j=m;
        int ans=-1;
        while(i<=j){
            int mid=(i+j)/2;
            int pow=sq(mid,n);
            if(pow==m){
                return mid;
            }
            else if(pow>m){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return ans;
    }
    
    static int sq(int num,int n){
        return (int)Math.pow(num,n);
    }
}
///////////////////////////////////////////////////

import java.io.*;
class GFG {
    private static double multiply(double number, int n) {
        double ans = 1.0;
        for(int i = 1;i<=n;i++) {
            ans = ans * number;
        }
        return ans; 
    }
    private static void getNthRoot(int n, int m) {
        double low = 1;
        double high = m;
        double eps = 1e-7; 
        
        while((high - low) > eps) {
            double mid = (low + high) / 2.0; 
            if(multiply(mid, n) < m) {
                low = mid; 
            }
            else {
                high = mid; 
            }
        }
        
        System.out.println(n+"th root of "+m+" is "+low);  
        
    }
	public static void main (String[] args) {
		int n = 3, m = 27; 
		getNthRoot(n, m); 
	}
}
