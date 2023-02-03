class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        int start=0; int s=0;
        int end=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];

            if(sum>max){
                max=sum;
                start=s;
                end=i;
            }
            if(sum<0){
                sum=0;
                s=i+1;
            }
        }
        return max;
    }
}

// Above can be modified to below code and re move the necessity of start,s,e no importance in using these variable



class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            max=Math.max(max,sum);
            sum=Math.max(0,sum);
        }
        return max;
    }
}
