package com.j4n_r.tictactoegui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller extends Game {

    @FXML
    private Button button0;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Label winnerLabel;

    @FXML
    private Button[] buttons;

    @FXML
    protected void initButtonArray() {
        buttons = new Button[]{button0, button1, button2, button3, button4, button5, button6, button7, button8};
    }

    @FXML
    protected void onButtonClick(int buttonNumber, Button button) {
        button.setText(String.valueOf(changeArrayOnClick(buttonNumber)));

        if (endGame()) {
            button.setDisable(true);
            winnerLabel.setText(Character.toString(checkForWinnerSymbol()) + " won the game!!!");
        }

        if (checkDraw()) {
            button.setDisable(true);
            winnerLabel.setText("It's a draw");
        }
    }

    @FXML
    protected void button0OnAction() {
        onButtonClick(0, button0);
    }

    @FXML
    protected void button1OnAction() {
        onButtonClick(1, button1);
    }

    @FXML
    protected void button2OnAction() {
        onButtonClick(2, button2);
    }

    @FXML
    protected void button3OnAction() {
        onButtonClick(3, button3);
    }

    @FXML
    protected void button4OnAction() {
        onButtonClick(4, button4);
    }

    @FXML
    protected void button5OnAction() {
        onButtonClick(5, button5);
    }

    @FXML
    protected void button6OnAction() {
        onButtonClick(6, button6);
    }

    @FXML
    protected void button7OnAction() {
        onButtonClick(7, button7);
    }

    @FXML
    protected void button8OnAction() {
        onButtonClick(8, button8);
    }

    @FXML
    protected void setWinnerLabel() {
        winnerLabel.setText(Character.toString(checkForWinnerSymbol()) + " won the game!!!");
    }

    @FXML
    protected void resetGameButtonOnAction() {
        resetGame();
        initButtonArray();
        for (Button button : buttons) {
            button.setText("");
            button.setDisable(false);
            winnerLabel.setText("");
        }
    }
}
