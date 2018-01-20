import java.util.ArrayList;
import java.util.Scanner;

public class SegmentedSieve {

	public static int MAX = 100001; //it is given that R-L < 10^6
	public static ArrayList<Integer> sieve(){
		boolean isPrime[] = new boolean[MAX];
		for (int i=0;i<MAX;i++){
			isPrime[i] = true;
		}
		
		for (int i=2;i*i<MAX;i++){
			if (isPrime[i]){
				for (int j=i*i;j<MAX;j=j+i){
					isPrime[j] = false;
				}
			}
		}
		
		ArrayList<Integer> listofprimes = new ArrayList<Integer>();
		listofprimes.add(2);
		for (int i=3;i<MAX;i=i+2){ //prime's always odd except for 2 :P
			if (isPrime[i]){
				listofprimes.add(i);
			}
		}
		
		return listofprimes;
	}
	
	public static void printPrimes(long left, long right, ArrayList<Integer> primes){
		boolean isPrime[] = new boolean[(int)(right-left)+1];
		for (int i=0;i<=right-left;i++){
			isPrime[i] = true;
		}
		
		for (int i=0; (long)primes.get(i)*primes.get(i)<=right; i++){
			int currPrime = primes.get(i);
			
			long base = (left/currPrime)*(currPrime); //gives the number just smaller than or equal to left
			if (base<left){
				base = base + currPrime;
			}
			//Mark all multiples within left to right as false
			for (long j=base; j<=right; j+=currPrime){
				isPrime[(int)(j-left)] = false; 
			}
			// there may be a case where base is itself a prime number
			if (base == currPrime && base<=right){
				isPrime[(int)(base-left)] = true;
			}
		}
		
		for (int i=0;i<=right-left;i++){
			if (isPrime[i]){
				System.out.println(i+left);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		ArrayList<Integer> primes = sieve();
		int t = s.nextInt();
		for (int i=0;i<t;i++){
			long left = s.nextLong();
			long right = s.nextLong();
			printPrimes(left,right,primes);
		}
				
	}

}
