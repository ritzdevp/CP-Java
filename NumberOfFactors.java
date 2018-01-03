import java.util.Scanner;

public class NumberOfFactors {
	
	
	static int prime[] = new int[1000000+1]; //prime number array boolean
	
	static boolean arr[] = new boolean[1000000+1];  //boolean prime array
	
	
	

	
	
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int ans[] = new int[t];
		
		prime[0] = 0;
		prime[1] = 0;
		
		

		for (int i=2;i<=1000000;i++){
			arr[i] = true;
		}
		arr[0] = false;
		arr[1] = false;
		
		
		
		for (int i=2; i <= Math.ceil((Math.sqrt(1000000))); i++){
			
			for (int j=i*i; j<=1000000; j=j+i){
				if (j<=1000000){
					if (arr[j] == true){
						arr[j] = false;
						
					}
				}
				
			}
		}
		
		
		for (int i=2;i<prime.length;i++){
			if (arr[i]){
				prime[i] = 1;
				
				int p = 2;
				while (i*p<prime.length){
					prime[i*p]++;
					p++;
				}
				
			}
				
			
		}
		
		int primeFactors[][] = new int[11][1000000+1];
		
		
		for (int i=0; i<11;i++){
			for (int j=1;j<=1000000; j++){
				if (prime[j] == i){
					primeFactors[i][j] = 1 + primeFactors[i][j-1];
				}else{
					primeFactors[i][j] = primeFactors[i][j-1];
				}
				
				
			}
		}

		
	
		
		
		for (int i=0;i<t;i++){
			int a = s.nextInt();
			int b = s.nextInt();
			int n = s.nextInt();
			
			
			ans[i] = primeFactors[n][b] - primeFactors[n][a-1];
			
						
		}
		
		for (int i=0;i<t;i++){
			System.out.println(ans[i]);
		}
	}

}
