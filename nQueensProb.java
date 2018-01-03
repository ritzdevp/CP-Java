import java.util.Scanner;

public class nQueensProb {
	
	
	public static boolean isPossible(int n, int row, int col, int board[][]){
		//same column
		for (int i=row-1;i>=0;i--){
			if (board[i][col] == 1){
				return false;
			}
		}
		
		//upper left
		for (int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
			if (board[i][j] == 1){
				return false;
			}
		}
		
		//upper right
		for (int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
			if (board[i][j] == 1){
				return false;
			}
		}
		return true;
	}
	
	public static void nQueenHelper(int n, int row, int board[][]){
		if (row==n){
			//print the board
			for (int i=0;i<n;i++){
				for (int j=0;j<n;j++){
					System.out.print(board[i][j] + " ");
				}
			}
			
			System.out.println();
		}
		
		for (int j=0;j<n;j++){
			if (isPossible(n,row,j,board)){
				board[row][j] = 1;
				nQueenHelper(n, row + 1, board);
				board[row][j] = 0;
			}
		}
	}
	
	public static void  placeNQueens(int n){
		int board[][] = new int[n][n];
		
		nQueenHelper(n, 0, board);
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		placeNQueens(n);
		
	}

}
