//No.2
//generating primes up to given ranges

import java.util.*;

class Sieve 
{ 
	//using sieve of Erathosthenes
	
    void sieveE(int n) 
    { 
        boolean prime[] = new boolean[n+1]; 
        for(int i=0;i<n;i++) 
            prime[i] = true; 
          
        for(int p = 2; p*p <=n; p++) 
        { 
            // If prime[p] is not changed, then it is a prime 
            if(prime[p] == true) 
            { 
                // Update all multiples of p 
                for(int i = p*p; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
          
        // Print all prime numbers 
        for(int i = 2; i <= n; i++) 
        { 
            if(prime[i] == true) 
                System.out.print(i + " "); 
        } 
    }
}
public class Solution2 {
 public static void main(String args[]) {
	 System.out.println("Enter the range :");
	Scanner input = new Scanner(System.in);
	int range = input.nextInt();
	Sieve sv = new Sieve();
	sv.sieveE(range);
  }
}
