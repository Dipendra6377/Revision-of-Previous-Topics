// can be write in better way to improve run time

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set=new HashSet<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            int j=i+1;  int k=n-1;

            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    k--;
                }
                else if (nums[i]+nums[j]+nums[k]<0){
                    j++;
                }
                else{
                    k--;
                }
            }

        }
        return new ArrayList<>(set);
    }
}
