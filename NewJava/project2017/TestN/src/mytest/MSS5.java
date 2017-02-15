package mytest;

public class MSS5 {

	   /**
     * Recursive maximum contiguous subsequence Prod algorithm.
     * Finds maximum Prod in subarray spanning a[left..right].
     * Does not attempt to maintain actual best sequence.
     */
    private static int maxProdRec( int [ ] a, int left, int right )
    {
        int maxLeftBorderProd = 0, maxRightBorderProd = 0;
        int leftBorderProd = 0, rightBorderProd = 0;
        int center = ( left + right ) / 2;
 
        if( left == right )  // Base case
            return a[ left ] > 0 ? a[ left ] : 0;
 
        int maxLeftProd  = maxProdRec( a, left, center );
        int maxRightProd = maxProdRec( a, center + 1, right );
 
        for( int i = center; i >= left; i-- )
        {
            leftBorderProd *= a[ i ];
            if( leftBorderProd > maxLeftBorderProd )
                maxLeftBorderProd = leftBorderProd;
        }
 
        for( int i = center + 1; i <= right; i++ )
        {
            rightBorderProd *= a[ i ];
            if( rightBorderProd > maxRightBorderProd )
                maxRightBorderProd = rightBorderProd;
        }
 
        return max3( maxLeftProd, maxRightProd,
                     maxLeftBorderProd * maxRightBorderProd );
    }
    
    /**
     * Return maximum of three integers.
     */
    private static int max3( int a, int b, int c )
    {
        return a > b ? a > c ? a : c : b > c ? b : c;
    }
    
    /**
     * Driver for divide-and-conquer maximum contiguous
     * subsequence Prod algorithm.
     */
    public static int maxSubProd4( int [ ] a )
    {
        return a.length > 0 ? maxProdRec( a, 0, a.length - 1 ) : 0;
    }
 
    /**
     * Simple test program.
     */
    public static void main( String [ ] args )
    {
        int a[ ] = { 4, -3, 5, -2, -1, 2, 6, -2 };
        int maxProd;
 

        maxProd = maxSubProd4( a );
        System.out.println( "Max Prod is " + maxProd );
    }
}
