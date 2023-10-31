public class Main
{
	public static void main(String[] args) {
	    int[][] board=new int[3][3];
	    for(int i=0;i<board.length;i++){
	        for(int j=0;j<board.length;j++){
	            board[i][j]=i+j;
	            System.out.println(board[i][j]);
	        }
	    }
	}
}
