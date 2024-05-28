import java.util.Scanner;

class TicTacTeo {
  public static void main(String[] args) {
   
   TicTacTeo obj = new TicTacTeo();
   obj.game();
   
   
   }
   
   public void game(){
   
    char[][] board = new char[3][3];
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[row].length; col++) {
        board[row][col] = ' ';
      }
    }

    char player = 'X';
    boolean gameOver = false;
    int count = 0;
    Scanner scanner = new Scanner(System.in);

    while (!gameOver) {
      printBoard(board);
      System.out.print("Player " + player + " enter: ");
      int row = scanner.nextInt();
      int col = scanner.nextInt();
      System.out.println();

      if (board[row][col] == ' ') {
        board[row][col] = player;  // place the element
          count++;
        gameOver = haveWon(board, player);
        if (gameOver) {
          System.out.println("Player " + player + " has won: ");
        }
        else if(count == board.length * board[0].length)
        {
            System.out.println("Game is Tie");
            break;
        }
        else {
          player = (player == 'X') ? 'O' : 'X';
        }
      } else {
        System.out.println("Invalid move. Try again!");
      }
    }
   
  }

  public static boolean haveWon(char[][] board, char player) {
    // check the rows
    
    for (int row = 0; row < board.length; row++) {
      if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
        return true;
      }
    }

    // check for col
    for (int col = 0; col < board[0].length; col++) {
      if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
        return true;
      }
    }

    // diagonal
    if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
      return true;
    }

    if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
      return true;
    }
    return false;
  }

  public static void printBoard(char[][] board) {
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[row].length; col++) {
        System.out.print(board[row][col] + " | ");
      }
      System.out.println();
    }
  }
}
