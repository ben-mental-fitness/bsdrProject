package net.quipV;
import org.apache.commons.math3.primes.Primes;

/**
 * Hello world!
 *
 */
public class Main
{

    int nextPrime(int x) {
      return Primes.nextPrime(x);
      //return 11;
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
