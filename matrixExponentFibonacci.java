import java.util.Scanner;

public class matrixExponentFibonacci {
	
	public static void multiply(int A[][], int M[][]){
		int first = A[0][0]*M[0][0] + A[0][1]*M[1][0];
		int second = A[0][0]*M[0][1] + A[0][1]*M[1][1];
		int third = A[1][0]*M[0][0] + A[1][1]*M[1][0];
		int fourth = A[1][0]*M[0][1] + A[1][1]*M[1][1];
		
		A[0][0] = first;
		A[0][1] = second;
		A[1][0] = third;
		A[1][1] = fourth;
			
	}
	
	public static void power(int A[][], int n){
		if (n==0 || n==1){
			return;
		}
		power(A,n/2);
		
		//multiply A^n/2 and A^n/2
		multiply(A,A);
		
		if (n%2!=0){
			int M[][] = {{1,1},{1,0}};
			multiply(A,M);
		}
	}
	
	public static int fib(int n){
		int A[][] = {{1,1},{1,0}};
		if (n==0){
			return 0;
		}
		
		power(A,n-1);
		
		return A[0][0];
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(fib(n));
		System.out.println(n+"th"+" "+"fibonacci number is "+fib(n));
		
	}

}
