// Method 1 using absolute value
import java.io.*;

class GFG {

    static void printTwoElements(int arr[], int size)
    {
        int i;
        System.out.print("The repeating element is ");

        for (i = 0; i < size; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
            else
                System.out.println(abs_val);
        }

        System.out.print("and the missing element is ");
        for (i = 0; i < size; i++) {
            if (arr[i] > 0)
                System.out.println(i + 1);
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 7, 3, 4, 5, 5, 6, 2 };
        int n = arr.length;
        printTwoElements(arr, n);
    }
}

// using cyclic sort

class Solve {
    public void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    int[] findTwoElement(int arr[], int n) {
        // code here
        int j=0;
        int[] ans = new int[2];
        
        while(j<n){
            if(arr[j]==arr[arr[j]-1]){
                j++;
                System.out.println(j);
            }
            else{
                swap(arr,j,arr[j]-1);
            }
        }
        
        
        for(int i=0;i<n;i++){
            if(arr[i]!=i+1){
                ans[0]=arr[i];
                ans[1]=i+1;
                break;
            }
        }
        return ans;
    }
 }
