package project.tictactoe;

public class Board {
    public void displayBoard() {
        char[] boardArray = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        System.out.println("  " + boardArray[0] + " | " + boardArray[1] + " | " + boardArray[2]);
        System.out.println("--------------");
        System.out.println("  " + boardArray[3] + " | " + boardArray[4] + " | " + boardArray[5]);
        System.out.println("--------------");
        System.out.println("  " + boardArray[6] + " | " + boardArray[7] + " | " + boardArray[8]);
    }
}
