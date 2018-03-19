import java.util.Scanner;

public class maxsumsubarrayOnlogn {
	
	public static int maxcrossingsum(int arr[], int left, int m, int right){
		int midtoleftSUM = Integer.MIN_VALUE;
		int midplus1torightSUM = Integer.MIN_VALUE;
		
		int sum = 0;
		for (int i=m;i>=0;i--){
			sum = sum + arr[i];
			if (sum > midtoleftSUM){
				midtoleftSUM = sum;
			}
		}
		
		sum = 0;
		for (int i=m+1;i<arr.length;i++){
			sum = sum + arr[i];
			if (sum > midplus1torightSUM){
				midplus1torightSUM = sum;
			}
		}
		
		return midplus1torightSUM + midtoleftSUM;
	}
	
	public static int func(int arr[], int n, int left, int right){
		if (left==right){
			return arr[left];
		}
		
		int m = (left+right)/2;
		
		return Math.max(func(arr,n,left,m), Math.max(func(arr,n,m+1,right), maxcrossingsum(arr,left,m,right)));
		
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i=0;i<n;i++){
			arr[i] = s.nextInt();
			
		}
		
		System.out.println(func(arr,n,0,n-1));
	}

}
