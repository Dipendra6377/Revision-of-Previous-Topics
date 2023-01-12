//  01 brute force
class Solution {
    public int singleNonDuplicate(int[] nums) {
    
        int i=0;
        int n=nums.length;
        if(n==1){
            return nums[0];
            }
        while(i<n){
            int next = (i+1)%n;

            if(nums[i]==nums[next]){
                i=i+2;
            }
            else{
                return nums[i];
            }
        }
        return -1;
    }
}

// 2 using xor operator xor of same number is 0 so only the single number will be there

// 3 optimized approach

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=n-2;

        while(i<=j){
            int mid =(i+j)>>1;

            if(nums[mid]==nums[mid^1]){      // xor of odd is even and even is odd
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return nums[i];
    }
}
