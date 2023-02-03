// can be write in better way to improve run time below code

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
                    j++;
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

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res= new ArrayList<List<Integer>>();

        Set<List<Integer>> set =new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;  int k=nums.length-1;

            while(j<k){
                if(nums[j]+nums[k]+nums[i]==0){
                    set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j<k && nums[j]==nums[j+1]){
                        j++;
                    }
                    j++;
                    while(j<k && nums[k]==nums[k-1]){
                        k--;
                    }
                    k--;
                }

                else if(nums[j]+nums[k]+nums[i]>0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return new ArrayList<>(set);

    }
}
