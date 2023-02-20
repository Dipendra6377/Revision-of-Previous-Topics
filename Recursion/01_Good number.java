class Solution {
    static long mod = 1000000007;
    public int countGoodNumbers(long n) {
        long even=(n%2)==0?n/2:(n/2)+1;
        long odd=n/2;
        long mul1 = pow(5,even);
        long mul2 = pow(4,odd);
        long ans=1;
        ans = ans*mul1%mod;
        ans = (mul2!=0)?(ans*mul2)%mod:ans;

        return (int)ans;
    }

    public long pow(long digit,long power){
        long temp;
        if(power==0) return 1;
        temp = pow(digit,power/2);

        if(power%2==0) return (temp*temp)%mod;
        else return (digit*temp*temp)%mod;
    }
}
