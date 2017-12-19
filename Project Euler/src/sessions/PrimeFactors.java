package sessions;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Double> primeFactors(double number) {
        double n = number;
        List<Double> factors = new ArrayList<Double>();
        for (double i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }

    public static void main(String[] args) {
        System.out.println("Primefactors of 600851475143 ");
        for (Double l : primeFactors(600851475143.0)) {
            System.out.println(l);
        }
     /*   System.out.println("Primefactors of 3");
        for (Integer integer : primeFactors(3)) {
            System.out.println(integer);
        }
        System.out.println("Primefactors of 32");
        for (Integer integer : primeFactors(32)) {
            System.out.println(integer);
        }*/
    }
}
