import java.util.Scanner;

public class maxsumsubarrayUsingKadanesAlgo {
	
	public static int func(int arr[], int n){
		int ans = arr[0];
		
		int sum = arr[0];
		
		for (int i=1;i<n;i++){
			
			sum = sum + arr[i];
			if (sum>ans){
				ans = sum;
			}else{
				sum = 0;
			}
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i=0;i<n;i++){
			arr[i] = s.nextInt();
			
		}
		
		System.out.println(func(arr,n));
	}

}
