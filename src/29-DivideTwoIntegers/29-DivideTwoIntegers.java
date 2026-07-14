// Last updated: 7/14/2026, 12:17:25 PM
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE&&divisor==-1){
            return Integer.MAX_VALUE;
        }
        long dd=Math.abs((long)dividend);
        long dr=Math.abs((long)divisor);
        long q=0;
        while(dd>=dr){
            long temp=dr;
            long mul=1;
            while(dd>=(temp<<1)){
                temp<<=1;
                mul<<=1;
            }
            dd-=temp;
            q+=mul;
        }
        if((dividend>0)^(divisor>0)){
            q=-q;
        }
        return (int)q;
    }
}