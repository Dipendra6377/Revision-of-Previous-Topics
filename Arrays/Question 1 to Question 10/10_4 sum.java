class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        long tar = (long)target;
        Set<List<Integer>> set =new HashSet<>();
        Arrays.sort(nums);
        
        

        for(int i=0;i<n-3;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            if((long) nums[i] + (long) nums[i+1] + (long) nums[i+2] + (long) nums[i+3] > (long) target) break;
            if((long) nums[i] + (long) nums[n-3] + (long) nums[n-2] + (long) nums[n-1] < (long) target) continue;

                int remain=target-nums[i];

            for(int j=i+1;j<n-2;j++){
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                if((long) nums[j] + (long) nums[j+1] + (long) nums[j+2] > (long) remain) break;
                if((long) nums[j] + (long) nums[n-2] + (long) nums[n-1] < (long) remain) continue;
                int k=j+1;  int l=n-1;

                while(k<l){
                    long sum = (long)nums[i]+nums[j]+nums[k]+nums[l];
                    

                    
                    if(sum==tar){
                        set.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        while(k<l && nums[k]==nums[k+1]){
                            k++;
                        }
                        k++;
                        while(k<l && nums[k]==nums[k-1]){
                            l--;
                        }
                        l--;
                    }

                    else if (sum>tar){
                        l--;

                    }
                    else {
                        k++;
                    }
                }
            }
        }

        return new ArrayList<>(set);

    }
}
