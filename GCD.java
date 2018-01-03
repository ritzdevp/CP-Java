import java.util.Scanner;

public class GCD {
	
	//EUCLID'S ALGO
	
	public static int gcdITERATIVElikeIdid(int a, int b){
	    int divisor = a;
	      int dividend = b;
	      int rem = -1;
	      int ans = -1;
	      while(rem!=0){
	        
	    	ans = rem;  
	    	rem = dividend % divisor;
	    	
	    	dividend = divisor;
	    	divisor = rem;
	        
	      }
	      
	      return ans;
		
	  }
	  
	  public static int gcdRECURSIVElikeSirdid(int a, int b){
	    
	    /*if (a<b){
	      return gcd(b,a);
	    }*/
	    
	    if (b==0){
	      return a;
	    
	    }
	    
	    return  gcdRECURSIVElikeSirdid(b,a%b);
	  }
		
		public static int gcd(int a,int b){
	      
	      int iterAns = gcdITERATIVElikeIdid(a,b);
	      int recAns = gcdRECURSIVElikeSirdid(a,b);
	      
	      /*return iterAns;*/ 
	      
	      
	      //OR
	      
	      
	      return recAns;
	      
		}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println(gcdRECURSIVElikeSirdid(a, b));
	}

}
