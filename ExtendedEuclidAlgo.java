import java.util.Scanner;

public class ExtendedEuclidAlgo {
	
	 
	
	
	public static int[] gcdExtendedEuclid(int a, int b){
		
		if (b==0){
			int Triplet[] = new int[3];
			Triplet[0] = a;
			Triplet[1] = 1;
			Triplet[2] = 0;
			
			return Triplet;
			
		}
		
		
		int smallAns[] = gcdExtendedEuclid(b, a%b);
		int myAns[] = new int[3];
		myAns[0] = smallAns[0];
		myAns[1] = smallAns[2];
		myAns[2] = smallAns[1] - (a/b)*smallAns[2];
		
		return myAns;
		
		
	}
	
	public static int modInverse(int A, int M){
		int ans[] = gcdExtendedEuclid(A, M);
		return ans[1];
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int ans[] = gcdExtendedEuclid(a, b);
		int mod = modInverse(a, b);
		
		System.out.println(ans[0]);
		System.out.println(ans[1]);
		System.out.println(ans[2]);
		System.out.println(mod);
		
		

	}

}
