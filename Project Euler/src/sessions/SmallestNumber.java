package sessions;

public class SmallestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.print(leastCommonMultiple(20));
	}
	static long leastCommonMultiple(long n) {
	    long multiple = 1;

	    for ( long i = 2; i <= n; i++ ) {
	        multiple *= i / gcd(i, multiple);
	    }

	    return multiple;
	}
	static long gcd(long a, long b) {
	    return ( 0 == b ) ? a : gcd(b, a%b);
	}
}
