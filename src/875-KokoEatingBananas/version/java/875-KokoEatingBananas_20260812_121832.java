// Last updated: 8/12/2026, 12:18:32 PM
1class Solution {
2    public int minEatingSpeed( int [] piles , int  h ) {
3        int max1 = 0;
4        for(int i = 0 ; i < piles.length ; i ++)
5            max1 = Math.max( max1 , piles[i] ) ;
6        return binarySearch(1 , max1 , piles , h , max1 ) ;
7    }
8    private int binarySearch( int start , int end , int p[] , int  hours ,int  ans ){
9        int h = hours;
10        if( start > end )   return ans;
11        int mid = start + ( end - start ) / 2 ;
12        for(int i = 0 ; i < p.length ; i++ )
13        {
14            int curr = p[i] ;
15            if(h == 0) 
16            {
17                return binarySearch( mid + 1 , end , p , hours , ans ) ;
18            }
19            h -= ( curr + mid - 1 ) / mid ;
20        }
21        if( h >= 0 ) 
22        {
23            ans = Math.min( ans , mid ) ;
24            return binarySearch( start , mid - 1 , p , hours , ans ) ;
25        
26        }
27        else    return binarySearch( mid + 1 , end , p , hours , ans ) ;
28    }
29}