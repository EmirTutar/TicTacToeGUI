package com.j4n_r.tictactoegui;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Game {
    private char[] gameBoard = new char[9];
    private int counter = 1;
    private final char userSymbol = 'X';
    private final char computerSymbol = 'Y';

    public Game() {
    }

    public char playRound(int addToCunter) {

        if (this.counter % 2 == 0) {
            System.out.println(counter);
            counter+= addToCunter;
            return userSymbol;
        } else {
            System.out.println(counter);
            counter += addToCunter;
            return computerSymbol;
        }

    }

    public char changeArrayOnClick(int buttonNumber) {
        if (gameBoard[buttonNumber] == 0) {
            char playerSymbol = playRound(1);
            gameBoard[buttonNumber] = playerSymbol;
            System.out.println(Arrays.toString(gameBoard));
            return playerSymbol;
        }
        if (this.counter % 2 == 0) {
            return computerSymbol;
        } else {
            return userSymbol;
        }
    }
    public boolean checkWinner() {
        // Check rows
        for (int i = 0; i < 9; i += 3) {
            if (gameBoard[i] != 0 && gameBoard[i] == gameBoard[i + 1] && gameBoard[i] == gameBoard[i + 2]) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (gameBoard[i] != 0 && gameBoard[i] == gameBoard[i + 3] && gameBoard[i] == gameBoard[i + 6]) {
                return true;
            }
        }

        // Check diagonals
        if (gameBoard[0] != 0 && gameBoard[0] == gameBoard[4] && gameBoard[0] == gameBoard[8]) {
            return true;
        }
        if (gameBoard[2] != 0 && gameBoard[2] == gameBoard[4] && gameBoard[2] == gameBoard[6]) {
            return true;
        }


        return false;

    }
// practically the exact same function as above, but didn't want to change everything else
    public char checkForWinnerSymbol() {
        if (checkWinner()) {
            for (int i = 0; i < 9; i += 3) {
                if (gameBoard[i] != 0 && gameBoard[i] == gameBoard[i + 1] && gameBoard[i] == gameBoard[i + 2]) {
                    return gameBoard[i];
                }
            }

            for (int i = 0; i < 3; i++) {
                if (gameBoard[i] != 0 && gameBoard[i] == gameBoard[i + 3] && gameBoard[i] == gameBoard[i + 6]) {
                    return gameBoard[i];
                }
            }

            if (gameBoard[0] != 0 && gameBoard[0] == gameBoard[4] && gameBoard[0] == gameBoard[8]) {
                return gameBoard[0];
            }
            if (gameBoard[2] != 0 && gameBoard[2] == gameBoard[4] && gameBoard[2] == gameBoard[6]) {
                return gameBoard[2];
            }
        }
        return 0;
    }
    public boolean checkDraw() {
        if (!checkWinner()) {
            for (char symbol : gameBoard) {
                if (symbol == 0) {
                    // Found an empty space, game is not a draw
                    return false;
                }
            }
            // No empty spaces found, the game is a draw
            return true;
        }
        return false;
    }

    public boolean endGame() {
        if (checkWinner()) {
            System.out.println("game Over");
            return true;
        } return false;
    }

    public void resetGame() {
        counter = 1;
        Arrays.fill(gameBoard, '\0');
    }

    public char[] getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(char[] gameBoard) {
        this.gameBoard = gameBoard;
    }
}
