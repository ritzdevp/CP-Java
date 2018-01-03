import java.util.Scanner;

public class SieveOfEathosthenes {
	
	public static int func(int n){
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
		
		return count;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(func(n));
	}

}
