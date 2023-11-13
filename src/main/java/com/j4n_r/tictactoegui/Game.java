package com.j4n_r.tictactoegui;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Game {
    private String[] gameBoard = new String[9];
    private int counter = 1;
    private final String userSymbol = "X";
    private final String computerSymbol = "Y";

    public Game() {
    }

    public String playRound(int addToCunter) {

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

    public String changeArrayOnClick(int buttonNumber) {
        if (gameBoard[buttonNumber] == null) {
            String playerSymbol = playRound(1);
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

    public String[] getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(String[] gameBoard) {
        this.gameBoard = gameBoard;
    }
}
