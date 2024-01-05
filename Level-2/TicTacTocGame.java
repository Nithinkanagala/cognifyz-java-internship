//TASK-1
import java.util.*;
public class TicTacTocGame {
    static String[] b;
	static String turn;
	static String checkWinner(){
		for (int a=0;a<8;a++){
			String line=null;
			switch(a){
			    case 0:line=b[0]+b[1]+b[2];
				       break;
			    case 1:line=b[3]+b[4]+b[5];
				       break;
			    case 2:line=b[6]+b[7]+b[8];
				       break;
			    case 3:line=b[0]+b[3]+b[6];
				       break;
			    case 4:line=b[1]+b[4]+b[7];
				       break;
			    case 5:line=b[2]+b[5]+b[8];
				       break;
			    case 6:line=b[0]+b[4]+b[8];
				       break;
			    case 7:line=b[2]+b[4]+b[6];
				       break;
			}
			if(line.equals("XXX")) {
				return "X";
			}else if (line.equals("OOO")) {
				return "O";
			}
        }
		for(int a=0;a<9;a++){
			if(Arrays.asList(b).contains(String.valueOf(a + 1))) {
				break;
			}else if(a==8) {
				return "draw";
			}
		}
		System.out.println(turn+"'s turn; enter a slot number to place "+turn+" in:");
		return null;
	}
	static void printb(){
		System.out.println("|---|---|---|");
		System.out.println("| "+b[0]+" | "+b[1]+" | "+b[2]+" |");
		System.out.println("|-----------|");
		System.out.println("| "+b[3]+" | "+b[4]+" | "+b[5]+" |");
		System.out.println("|-----------|");
		System.out.println("| "+b[6]+" | "+b[7]+" | "+b[8]+" |");
		System.out.println("|---|---|---|");
	}
    public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		b=new String[9];
		turn="X";
		String winner=null;
		for(int a=0;a<9;a++){
			b[a]=String.valueOf(a+1);
		}
		System.out.println("Welcome to 3x3 Tic Tac Toe.");
		printb();
		System.out.println("X will play first. Enter a slot number to place X in:");
		while (winner == null) {
			int numInput;
			try {
				numInput=in.nextInt();
				if(!(numInput>0 && numInput<=9)) {
					System.out.println("Invalid input; re-enter slot number:");
					continue;
				}
			}catch (InputMismatchException e) {
				System.out.println("Invalid input; re-enter slot number:");
				continue;
			}
			if(b[numInput-1].equals(String.valueOf(numInput))){
				b[numInput - 1] = turn;
				if(turn.equals("X")) {
					turn = "O";
				}else{
					turn="X";
				}
				printb();
				winner = checkWinner();
			}else {
				System.out.println("Slot already taken; re-enter slot number:");
			}
		}
		if(winner.equalsIgnoreCase("draw")){
			System.out.println("It's a draw! Thanks for playing.");
		}else{
			System.out.println("Congratulations! "+winner+"'s have won! Thanks for playing.");
		}
	    in.close();
	}
}

/*Output:
Welcome to 3x3 Tic Tac Toe.
|---|---|---|
| 1 | 2 | 3 |
|-----------|
| 4 | 5 | 6 |
|-----------|
| 7 | 8 | 9 |
|---|---|---|
X will play first. Enter a slot number to place X in:
3
|---|---|---|
| 1 | 2 | X |
|-----------|
| 4 | 5 | 6 |
|-----------|
| 7 | 8 | 9 |
|---|---|---|
O's turn; enter a slot number to place O in:
1
|---|---|---|
| O | 2 | X |
|-----------|
| 4 | 5 | 6 |
|-----------|
| 7 | 8 | 9 |
|---|---|---|
X's turn; enter a slot number to place X in:
5
|---|---|---|
| O | 2 | X |
|-----------|
| 4 | X | 6 |
|-----------|
| 7 | 8 | 9 |
|---|---|---|
O's turn; enter a slot number to place O in:
4
|---|---|---|
| O | 2 | X |
|-----------|
| O | X | 6 |
|-----------|
| 7 | 8 | 9 |
|---|---|---|
X's turn; enter a slot number to place X in:
7
|---|---|---|
| O | 2 | X |
|-----------|
| O | X | 6 |
|-----------|
| X | 8 | 9 |
|---|---|---|
Congratulations! X's have won! Thanks for playing.
 */
