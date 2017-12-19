package sessions;

public class SquareDiff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sumN=(long)Math.pow(new Double(sum(100, 1)),2.0);
		long sumSq=sum(100, 2);
		
		System.out.print(sumN-sumSq);
	}
	
	private static long sum(int n, int a){
		long s=0;
		
		if(a==1){
			s=(n*(n+1))/2;
		}
		else if(a==2){
			s=(n*(n+1)*(2*n+1))/6;
		}
		return s;
		
	}

}
