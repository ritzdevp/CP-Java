import java.util.Scanner;

public class Euler_Totient_Function {
	
	// O (n log (log n))
	
	public static int eulerphi(int n){
		int phi[] = new int[n+1];
		for (int i=1;i<phi.length;i++){
			phi[i] = i;
		}
		
		for (int i=2; i<=n ; i++){
			if (phi[i] == i){
				phi[i] = i-1;
				for (int j=2*i;j<=n;j=j+i){
					phi[j] = ( phi[j] * (i-1) ) / i ;
				}
			}
		}
		
		return phi[n];
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(eulerphi(n));
	}

}
