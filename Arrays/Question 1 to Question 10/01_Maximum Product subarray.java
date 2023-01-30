class Solution {
    public int maxProduct(int[] arr) {
        int max=arr[0];
        int min=arr[0];
        int ans=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
                int temp=max;
                max=min;
                min=temp;
            }

            max=Math.max(arr[i],arr[i]*max);
            min=Math.min(arr[i],arr[i]*min);

            ans=Math.max(max,ans);
        }
        return ans;
    }
}
