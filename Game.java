import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	char [][] board = new char[3][3] ;

	for(int i=0;i<3;i++)
		for (int j=0;j<3;j++)
		board[i][j]=' '; 

	char player = 'X';
	boolean gameover = false;
    printboard(board);
	while (!gameover){
		//printboard(board);
		System.out.println ("Player "+player+" enter coords (r/c): ");
		int row = sc.nextInt();
		int col = sc.nextInt();


		if ( 0<=row && 0<=col &&row<=2 && col <=2&&board[row][col]==' '){
		board[row][col]=player;
		printboard(board);
		gameover = wongame(board, player);
		if (isDraw(board)){
			System.out.print("Its a draw !!!");
			break;
		}
		if (gameover){
			printboard(board);
			System.out.println("Player "+player+" has won the game !!!");
		}
		else {
			player=(player=='X')?'O':'X';
	}
	}
	else {
		System.out.println("Invalid move!!!");
	}
	}

	}

	public static boolean wongame (char[][] board , char player ){
		//rows 
		for (int i=0;i<3;i++){
			if (board[i][0]==player&&board[i][1]==player&&board[i][2]==player){
				return true;
			}
		}
		//coloums
		for (int i=0;i<3;i++){
			if (board[0][i]==player&&board[1][i]==player&&board[2][i]==player){
				return true;
			}
		}
		//diagonals 
		if (board[0][0]==player&&board[1][1]==player&&board[2][2]==player){
				return true;
		}
		if (board[2][0]==player&&board[1][1]==player&&board[0][2]==player){
				return true;
		}
		else return false;
		
	}
	public static boolean isDraw(char[][] b) {
    for (int i = 0; i < 3; i++)
        for (int j = 0; j < 3; j++)
            if (b[i][j] == ' ') return false;
    return true;
}

	/*public static void printboard (char [][] board){
		for(int i=0;i<3;i++){
		for (int j=0;j<3;j++){
			System.out.print(board[i][j]+" | " );
		}
		System.out.println("\n");	
	}
}*/

public static void printboard(char[][] board) {
    System.out.println();
    for (int i = 0; i < 3; i++) {
        System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
        if (i < 2) System.out.println("---+---+---");
    }
    System.out.println();
}

}