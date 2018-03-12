import java.util.Scanner;

public class left_right_handers {
	
	
	public static int func(int left, int right, int ambi){
		
		if ((left==0 && ambi==0) || (right==0 && ambi==0)){
			return 0;
		}
		
		if (left==right){
			return (2*left + (ambi/2)*2);
		}
		
		if (left<right){
			while (ambi!=0 && left<right){
				left++;
				ambi--;
			}
			
			return Math.min(left, right)*2 + (ambi/2)*2;
		}
		
		while (ambi!=0 && right<left){
			right++;
			ambi--;
		}
		
		return Math.min(left, right)*2 + (ambi/2)*2;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int left  = s.nextInt();	
		int right = s.nextInt();
		int ambi = s.nextInt();
		
		System.out.println(func(left,right,ambi));
	}

}
