package com.j4n_r.tictactoegui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller extends Game {
    @FXML
    private Label welcomeText;

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
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void button0OnAction() {
        button0.setText(String.valueOf(String.valueOf(changeArrayOnClick(0))));
        if (endGame()) {
            button0.setDisable(true);
            winnerLabel.setText("Game Over");
        }
        if (checkDraw()) {
            button0.setDisable(true);
            winnerLabel.setText("Its a draw");
        }
    }


    @FXML
    protected void button1OnAction() {
        button1.setText(String.valueOf(changeArrayOnClick(1)));
        if (endGame()) {
            button1.setDisable(true);
            winnerLabel.setText("Game Over");
        }
        if (checkDraw()) {
            button0.setDisable(true);
            winnerLabel.setText("Its a draw");
        }
    }

    @FXML
    protected void button2OnAction() {

        button2.setText(String.valueOf(changeArrayOnClick(2)));
        if (endGame()) {
            button2.setDisable(true);
            winnerLabel.setText("Game Over");
        }
    }

    @FXML
    protected void button3OnAction() {
        button3.setText(String.valueOf(changeArrayOnClick(3)));
        if (endGame()) {
            button3.setDisable(true);
            winnerLabel.setText("Game Over");
        }
        if (checkDraw()) {
            button0.setDisable(true);
            winnerLabel.setText("Its a draw");
        }
    }

    @FXML
    protected void button4OnAction() {

        button4.setText(String.valueOf(changeArrayOnClick(4)));
        if (endGame()) {
            button4.setDisable(true);
            winnerLabel.setText("Game Over");
        }
        if (checkDraw()) {
            button0.setDisable(true);
            winnerLabel.setText("Its a draw");
        }
    }

    @FXML
    protected void button5OnAction() {

        button5.setText(String.valueOf(changeArrayOnClick(5)));
        if (endGame()) {
            button5.setDisable(true);
            winnerLabel.setText("Game Over");

        }
        if (checkDraw()) {
            button0.setDisable(true);
            winnerLabel.setText("Its a draw");
        }
    }

    @FXML
    protected void button6OnAction() {

        button6.setText(String.valueOf(changeArrayOnClick(6)));
        if (endGame()) {
            button6.setDisable(true);
            winnerLabel.setText("Game Over");
        }
        if (checkDraw()) {
            button0.setDisable(true);
            winnerLabel.setText("Its a draw");
        }
    }

    @FXML
    protected void button7OnAction() {

        button7.setText(String.valueOf(changeArrayOnClick(7)));
        if (endGame()) {
            button7.setDisable(true);
            winnerLabel.setText("Game Over");
        }
        if (checkDraw()) {
            button0.setDisable(true);
            winnerLabel.setText("Its a draw");
        }
    }

    @FXML
    protected void button8OnAction() {

        button8.setText(String.valueOf(changeArrayOnClick(8)));
        if (endGame()) {
            button8.setDisable(true);
            winnerLabel.setText("Game Over");
        }
        if (checkDraw()) {
            button0.setDisable(true);
            winnerLabel.setText("Its a draw");
        }

    }


}