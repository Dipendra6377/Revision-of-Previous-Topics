class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i=0;
        int j=1000000000;
        int minbanana=-1;

        while(i<=j){
            int mid=i+(j-i)/2;

            if(findMaxHr(mid,piles,h)){
                minbanana=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return minbanana;
    }
    public boolean findMaxHr(int hrs,int[] piles,int h){
        int total=0;
        for(int i=0;i<piles.length;i++){
            total+=Math.ceil(piles[i]*1.0/hrs);
        }
        return total<=h;
    }
}
