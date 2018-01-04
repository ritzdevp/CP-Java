import java.util.Scanner;

public class Mod_Exponentiation_Rec_And_Iter {

	// (a^b)%c ; c is the modulus
	public static int modRecursive(int a, int b, int c){
		
		if (b==0){
			return 1;
		}
		
		if (b%2==0){
			//even
			return modRecursive((a*a)%c, b/2, c);
		}else{
			//odd 
			return ((a%c)*(modRecursive((a*a)%c, (b-1)/2, c)))%c;
		}
		
	}
	
	public static int modIterative(int a, int b, int c){
		int result = 1;
		
		while (b>0){
			//if odd
			if (b%2!=0){
				result  = ( result * a ) % c ;
			}
			
			a = ( a * a ) % c;
			
			b = b / 2;
		}
		
		return result%c;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		System.out.println(modRecursive(a, b, c));
		System.out.println(modIterative(a, b, c));
		
		
		
	}

}
