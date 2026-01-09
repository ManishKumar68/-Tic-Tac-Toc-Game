import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for (int row = 0; row < board.length; row++) {
            for (int col = 0;
                 col < board[row].length;
                 col++) {
                board[row][col] = ' ';
            }
        }

        Scanner scanner = new Scanner(System.in);

        // Username name added
        System.out.print("Enter name for Player X: ");
        String playerX = scanner.nextLine();
        System.out.print("Enter name for Player O: ");
        String playerO = scanner.nextLine();

        char player = 'X';
        boolean gameOver = false;

        while (!gameOver) {
            printBoard(board);
            String currentPlayerName = (player == 'X') ? playerX : playerO;

            System.out.print(currentPlayerName + " (" + player + ") enter row and column: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            System.out.println();

            if (board[row][col] == ' ') {
                board[row][col] = player;
                gameOver = haveWon(board, player);

                if (gameOver) {
                    System.out.println("Player " + currentPlayerName + "has won!");
                } else {
                    player = (player == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move. Try Again");
            }
        }
        printBoard(board);
    }

    public static boolean haveWon(char[][] board, char player) {

        // rows Check
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player &&
                    board[row][1] == player &&
                    board[row][2] == player) {
                return true;
            }
        }

        // columns check
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == player &&
                    board[1][col] == player &&
                    board[2][col] == player) {
                return true;
            }
        }

        // diagonals check..
        if (board[0][0] == player &&
                board[1][1] == player &&
                board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player &&
                board[1][1] == player &&
                board[2][0] == player) {
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
