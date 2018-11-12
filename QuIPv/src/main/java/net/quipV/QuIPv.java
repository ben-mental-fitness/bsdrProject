package net.quipV;
import org.apache.commons.math3.primes.Primes;

/**
 *Main Back-End Controller for the QuIPv Application
 *Interacts with UI then performs appropiate actions using package modules
 */
public class QuIPv
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
