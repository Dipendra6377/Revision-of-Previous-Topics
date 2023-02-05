// same concept as koko banana

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=-1;
        int ans=-1;
        for(int key:nums){
            max=Math.max(max,key);
        }
        int i=0;
        int j=max;
        System.out.println(j);

        while(i<=j){
            int mid=i+(j-i)/2;

            if(findThreshold(nums,threshold,mid)){
                ans=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return ans;
    }

    public boolean findThreshold(int[] nums,int target,int value){
        int findthres=0;

        for(int i=0;i<nums.length;i++){
            findthres+=Math.ceil(nums[i]*1.0/value);
        }
        return findthres<=target;
    }
}
