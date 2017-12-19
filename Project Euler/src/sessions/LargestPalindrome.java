package sessions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
//import java.util.Stack;

public class LargestPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Long> arr = new ArrayList<Long>(); 
		int num1 = 0, num2 = 0;
		for(int i=100; i<1000; i++){
		    for(int j=100; j<1000; j++){
		        String mul = String.valueOf(i*j);
		        if(isPalindrome(mul)){
		            num1 = i;
		            num2 = j;
		            arr.add(new Long(num1*num2));
		            
		        }
		    }
		}
		System.out.println(Collections.max(arr));
	}
	
	private static boolean isPalindrome(String str) {
	    String strRev = new StringBuilder(str).reverse().toString();
	    return str.equals(strRev);
	}
	
/*	Long largestPalindrome(){
		
	
		ArrayList<Long> arr = new ArrayList<Long>();    
	    for(long i =999; i>100; i--){
	        for(long j = 999; j>100; j--){
	            long mul = j*i;
	            if(isPalin(mul)){
	                arr.add(j * i);
	            }
	        }
	        
	        
	        
	        
	}
	    long m=Collections.max(arr);
		return m;

}
	boolean isPalin(Long i){
		return new StringBuilder(i.toString()).equals(new StringBuilder().append(i).reverse());
				
	}*/
	
}


/*function largestPalindrome(){

    var arr = [];    
    for(var i =999; i>100; i--){
        for(var j = 999; j>100; j--){
            var mul = j*i;
            if(isPalin(mul)){
                arr.push(j * i);
            }
        }
    }

    return Math.max.apply(Math, arr);
}

function isPalin(i){
    return i.toString() == i.toString().split("").reverse().join("");
}

console.log(largestPalindrome());*/