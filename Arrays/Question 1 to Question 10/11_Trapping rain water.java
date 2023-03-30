class Solution {
    public int trap(int[] height) {
        int l=0; int n=height.length;
        int r=n-1;
        int res=0;
        int leftmaxheight=0;
        int rightmaxheight=0;


        while(l<=r){
            if(height[l]<height[r]){
                if(height[l]>=leftmaxheight){
                    leftmaxheight=height[l];
                }
                else{
                    res+=leftmaxheight-height[l];
                }
                l++;
            }
            else{
                if(height[r]>=rightmaxheight){
                    rightmaxheight=height[r];
                }
                else{
                    res+=rightmaxheight-height[r];
                }
                r--;
            }
        }
        return res;
    }
}
