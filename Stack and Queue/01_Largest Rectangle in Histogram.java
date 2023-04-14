class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;

        Stack<Integer> st=new Stack<>();
        int ans=0;
        for(int i=0;i<=n;i++){

            while(!st.isEmpty() && (i==n || heights[st.peek()]>=heights[i]) ){
                int h=heights[st.peek()];
                st.pop();
                int w=0;
                if(st.empty()) w=i;
                else w=i-st.peek()-1;
                ans=Math.max(ans,w*h);
            }

            
            st.push(i);
        }
        return ans;
    }
}
