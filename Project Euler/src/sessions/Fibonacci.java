package sessions;

public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long sum=2;
		long a=1,b=2,c=3;
		
		do{
			c=a+b;
			a=b;
			b=c;
			if(c%2==0)
				sum+=c;
		}while(c< 4000000);
		
		System.out.println(sum);
		

	}

}
