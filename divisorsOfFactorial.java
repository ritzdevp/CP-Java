import java.util.Scanner;

public class divisorsOfFactorial {
	
	
	public static boolean[] func(int n){
		boolean arr[] = new boolean[n+1];
		for (int i=2;i<=n;i++){
			arr[i] = true;
		}
		arr[0] = false;
		arr[1] = false;
		
		int count = (n+1)-2;
		
		for (int i=2; i <= Math.ceil((Math.sqrt(n))); i++){
			
			for (int j=i*i; j<=n; j=j+i){
				if (j<=n){
					if (arr[j] == true){
						arr[j] = false;
						count--;
					}
				}
				
			}
		}
		
		return arr;
		
	}
	
	public static boolean prime[] = func(500000);

	
	public static long numberOfdiv(int n){
		
		long ans = 1;
		
		for (int i=0;i<=n;i++){
			if (prime[i]){
				long a = 0;
				int k = 1;
				while ((long)Math.pow(i, k) <= n){
					a+=n/(long)Math.pow(i, k);
					k++;
				}
				int m = 1000000000+7;
				ans = ((ans%m) * ( (a+1)%m ) ) % m;
			}
		}
		
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		long ans[] = new long[t];
		
		
		boolean prime[] = func(500000);
		
		for (int i=0;i<t;i++){
			int n = s.nextInt();
			ans[i] = numberOfdiv(n);
			
		}
		
		for (int i=0;i<t;i++){
			System.out.println(ans[i]);
		}
		
	}

}
